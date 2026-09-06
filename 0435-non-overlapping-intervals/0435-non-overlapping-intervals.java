class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int kept =1;
        int lastendtime= intervals[0][1];
        for(int i =1; i<intervals.length; i++){
            int currentstart = intervals[i][0];
            int currentend= intervals[i][1];
            if(currentstart>=lastendtime){
                kept++;
                lastendtime = currentend;
            }
        }
        return intervals.length - kept;
    }
}