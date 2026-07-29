class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length()){
            return false;
        }
        int[] nums = new int[26];
        for(char c: magazine.toCharArray()){
            nums[c-'a']++;

        }
         for(char c: ransomNote.toCharArray()){
            nums[c-'a']--;
            if(nums[c-'a']<0){
                return false;
            }
            

        }
        return true;
        
    }
}