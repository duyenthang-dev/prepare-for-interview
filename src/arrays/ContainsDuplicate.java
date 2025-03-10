package arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (freq.containsKey(nums[i])) {
                return true;
            }
            freq.put(nums[i], 1);
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate cd = new ContainsDuplicate();
        int[] nums = { 1, 2, 3, 1 };
        boolean result = cd.containsDuplicate(nums);
        System.out.println(result);
    }

}