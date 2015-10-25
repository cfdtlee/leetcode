// binary search 
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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int pos = 0;
        for(int i = 0; i < intervals.size(); i++) {
            if(intervals.get(i).start <= newInterval.start && intervals.get(i).end >= newInterval.end) return intervals;
            if(intervals.get(i).start >= newInterval.start && intervals.get(i).end <= newInterval.end) {
                pos = i;
                intervals.remove(i--);
            }
            else if(intervals.get(i).start <= newInterval.end && intervals.get(i).end >= newInterval.end) {
                newInterval.end = intervals.get(i).end;
                pos = i;
                intervals.remove(i--);
            }
            else if(intervals.get(i).start <= newInterval.start && intervals.get(i).end >= newInterval.start) {
                newInterval.start = intervals.get(i).start;
                pos = i;
                intervals.remove(i--);
            }
            else if(intervals.get(i).end < newInterval.start) pos = i+1;
        }
        intervals.add(pos, newInterval);
        return intervals;
    }
}

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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int pos = 0;
        while(pos < intervals.size() && newInterval.start > intervals.get(pos).end)
            pos++;
        while(pos < intervals.size() && newInterval.end >= intervals.get(pos).start) {
            newInterval = new Interval(Math.min(newInterval.start, intervals.get(i).start), Math.max(newInterval.end, intervals.get(i).end));
            intervals.remove(pos);
        }
        return intervals;
    }
}



