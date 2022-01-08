import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,4,5,6,7};
        int[] nums2 = new int[]{-1,-100,3,99};
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate2(nums1, 3);
        rotateArray.rotate2(nums2, 2);

    }

    public void rotate2(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    static void reverse(int [] nums, int start, int end){
        // reversing the Array Using two pointer Method
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {
        while (k > 0) {
            int buffer1 = nums[0];
            int buffer2 = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (i == nums.length - 1) {
                    nums[0] = buffer1;
                    continue;
                }
                buffer2 = nums[i + 1];
                nums[i + 1] = buffer1;
                buffer1 = buffer2;
            }
            k--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
