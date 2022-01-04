public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(nums1));
        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(nums2));
    }

    public int removeDuplicates(int[] nums) {
        int[] resultArray = new int[nums.length];
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (size > 0 && nums[i] == resultArray[size - 1]) {
                continue;
            }
            resultArray[size] = nums[i];
            size++;
        }
        for (int i = 0; i < resultArray.length; i++) {
            nums[i] = resultArray[i];
        }
        return size;
    }
}
