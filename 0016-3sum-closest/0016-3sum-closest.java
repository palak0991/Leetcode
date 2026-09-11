import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int best = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // Check if this sum is closer to target
                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }

                // Exact answer
                if (sum == target) {
                    return sum;
                }

                // Need a bigger sum
                else if (sum < target) {
                    left++;
                }

                // Need a smaller sum
                else {
                    right--;
                }
            }
        }

        return best;
    }
}