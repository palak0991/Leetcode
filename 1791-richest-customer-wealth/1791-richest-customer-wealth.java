class Solution {
    public int maximumWealth(int[][] accounts) {
        int eachsum[] = new int[accounts.length];
        for(int i =0; i<accounts.length; i++){
            eachsum[i]=sum(accounts[i]);
        }
        int max =0;
        for(int i:eachsum){
            if(max<i) max =i;
        }
        return max;
    }

    public int sum(int [] a){
        int sum =0;
        for(int i : a){
            sum+=i;
        }
        return sum;
    }
}