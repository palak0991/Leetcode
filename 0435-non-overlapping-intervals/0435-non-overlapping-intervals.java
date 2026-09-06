class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        // Sort by ending time
        Arrays.sort(intervals, (a, b) ->
            Integer.compare(a[1], b[1])
        );

        int kept = 1;
        int lastEndTime = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            // Non-overlapping
            if (currentStart >= lastEndTime) {
                kept++;
                lastEndTime = currentEnd;
            }
        }

        // Total - intervals we could keep
        return intervals.length - kept;
    }
}