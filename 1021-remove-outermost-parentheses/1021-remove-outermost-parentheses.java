class Solution {
    public String removeOuterParentheses(String s) {
        int depth =0;
        StringBuilder result = new StringBuilder();
        for (char i:s.toCharArray()){
            if(i=='('){
                if (depth>0){
                    result.append(i);
                }
                depth++;
            }
            else{
                depth--;
                if(depth >0){
                    result.append(i);
                }
            }

        }
        return result.toString();
    }
}