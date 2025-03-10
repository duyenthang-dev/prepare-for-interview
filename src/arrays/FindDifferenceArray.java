package arrays;

public class FindDifferenceArray {
    public int[] findDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] differenceArray = new int[n];
        int leftSum = 0;
        int rightSum = 0;
        int sum = 0;
        for (int i =0; i < nums.length; i++) {
            sum += nums[i];
        }
        rightSum = sum;
        for (int i =0; i < nums.length; i++) {
            rightSum = rightSum - nums[i];
            var diff =  Math.abs(rightSum - leftSum);
            differenceArray[i] = diff;
            leftSum += nums[i];
        }

        return differenceArray;
    }

    public static void main(String[] args) {
        var fda = new FindDifferenceArray();
        int[] nums = {1, 2 };
        int[] result = fda.findDifferenceArray(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
