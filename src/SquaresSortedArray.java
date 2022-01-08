import java.util.Arrays;

public class SquaresSortedArray {

    public static void main(String[] args) {
        int[] nums1 = new int[]{-4, -1, 0, 3, 10};
        int[] nums2 = new int[]{-7, -3, 2, 3, 11};
        SquaresSortedArray squaresSortedArray = new SquaresSortedArray();
        System.out.println(Arrays.toString(squaresSortedArray.sortedSquares(nums1)));
        System.out.println(Arrays.toString(squaresSortedArray.sortedSquares(nums2)));
    }

    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i] * nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                continue;
            }
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int buffer = nums[i];
                    nums[i] = nums[j];
                    nums[j] = buffer;
                }
            }
        }
        return nums;
    }
}
