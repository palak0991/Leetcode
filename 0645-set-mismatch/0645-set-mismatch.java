class Solution {
    public static int[] findErrorNums(int[] nums) {
        int i = 0; 
        while(i<nums.length){
            int correct = nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums, i , correct);

            }else{
                i++;
            }
            //finding the missing number
            
        }
        for (int j =0; j<nums.length; j++){
                if (nums[j]!=j+1){
                    return new int[]{nums[j], j+1};
                }
            }
        return new int[] {-1,-1};
         
    }
    public static void swap(int [] nums , int start , int end ){
        int temp = nums[start];
        nums[start]= nums[end ];
        nums[end]= temp;
    }
    
    }
