package arrays;

public class LargestAltitude {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0; // To store the maximum altitude encountered
        int curr = 0;
        for (int i = 0; i < gain.length; i++) {
            curr += gain[i];
            if (maxAltitude <= curr) {
                maxAltitude = curr;
            }
        }
        return maxAltitude;
    }

    public static void main(String[] args) {
        var sol = new LargestAltitude();
        int[] nums = {};
    
        int result = sol.largestAltitude(nums);
        System.out.println(result);
    }
}
