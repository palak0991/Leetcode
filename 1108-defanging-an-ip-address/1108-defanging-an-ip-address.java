class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder(address);
        for (int i = sb.length()-1; i>0; i--){
            char ch = sb.charAt(i);
            if(ch == '.'){
                sb.deleteCharAt(i);
                sb.insert(i,"[.]");
            }
        }
        return sb.toString();   
    }
}