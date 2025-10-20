class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum = 0;
        for(int i = 0; i<nums.length; i++){
            totalsum+=nums[i];
            }
        int lsum= 0;
        for (int i = 0; i<nums.length; i++){
            int rsum= totalsum- lsum -nums[i];
            if(lsum== rsum){
                return i;
            }
            lsum = nums[i]+lsum;
        
        }     
        

        return -1;

    }
}