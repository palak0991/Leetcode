class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr = new int[nums.length];
        int posi=0;
        int negi=1;
        for (int i =0; i<nums.length; i++){
            if(nums[i]>0){
                arr[posi]=nums[i];
                posi= posi+2;

            }
            else{
                arr[negi]= nums[i];
                negi = negi+2;
            }
            
        }
        return arr;
    }
}