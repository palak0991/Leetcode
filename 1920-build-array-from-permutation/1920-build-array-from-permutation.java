class Solution {
    public int[] buildArray(int[] nums) {
        int[] newnums = new int[nums.length];
        for (int i = 0; i< nums.length; i++){
            newnums[i]= nums[nums[i]];
        }
        return newnums;
    }
}