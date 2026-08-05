class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char p = s.charAt(i);
            char q = t.charAt(i);
            if(map.containsKey(p)){
                if(map.get(p)!=q){
                    return false;
                }  
            }
            else{
                if(map.containsValue(q)){
                    return false;
                }
                map.put(p,q);
            }
        
        }
        return true;
    }
}