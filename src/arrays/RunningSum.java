package arrays;
public class RunningSum {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int s = 0;
        for (int i =0; i < nums.length; i++) {
            s += nums[i];
            result[i] = s;
        }
        return result;
    }

    public static void main(String[] args) {
        RunningSum rs = new RunningSum();
        int[] nums = {1, 2, 3, 4};
        int[] result = rs.runningSum(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
