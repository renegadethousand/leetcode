import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();

        System.out.println(Arrays.toString(ts.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(ts.twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(ts.twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(ts.twoSum(new int[]{3, 2, 3}, 6)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}
