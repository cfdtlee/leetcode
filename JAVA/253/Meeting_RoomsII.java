/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        if(intervals.length == 0) return 0;
        Arrays.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval a, Interval b) { return a.start - b.start; }
        });
        PriorityQueue<Interval> pq = new PriorityQueue<Interval>(intervals.length, new Comparator<Interval>() {
            public int compare(Interval a, Interval b) { return a.end - b.end; }
        });
        pq.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++) {
            Interval interval = pq.poll();
            if(intervals[i].start >= interval.end) { // boundary condition! 
                interval.end = intervals[i].end;
            }
            else pq.add(intervals[i]);
            pq.add(interval);
        }
        return pq.size();
    }
}