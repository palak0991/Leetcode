

import java.util.Arrays;

class Solution {
    public int minimizeSum(int[] nums) {

        int n = nums.length;

        if (n <= 3) {
            return 0;
        }

        Arrays.sort(nums);

        int ans = Integer.MAX_VALUE;

        // Change 2 smallest
        ans = Math.min(ans, nums[n - 1] - nums[2]);

        // Change smallest and largest
        ans = Math.min(ans, nums[n - 2] - nums[1]);

        // Change 2 largest
        ans = Math.min(ans, nums[n - 3] - nums[0]);

        return ans;
    }
}

