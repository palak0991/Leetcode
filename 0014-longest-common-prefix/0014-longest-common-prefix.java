class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first =strs[0];
        StringBuilder ans = new StringBuilder();
        boolean same = true;
        for (int i =0; i<first.length(); i++){
            char ch = first.charAt(i);
            for( int j=1 ; j<strs.length;j++){
                if(i>=strs[j].length()){
                    return ans.toString();
                }
                if(ch !=strs[j].charAt(i)){
                    same = false;
                }
            }
            if(same ){
                ans.append(ch);
            }
            else{
                break;
            }
        }
        return ans.toString();
    }
}