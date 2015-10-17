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
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> list = new LinkedList<Interval>();
        if(intervals.size() == 0) return list;
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });
        int start = intervals.get(0).start, end = intervals.get(0).end;
        for(int i = 1; i < intervals.size(); i++) {
            if(intervals.get(i).start <= end) { // <=
                end = intervals.get(i).end < end ? end : intervals.get(i).end;
            }
            else {
                list.add(new Interval(start, end));
                start = intervals.get(i).start;
                end = intervals.get(i).end;
            }
        }
        list.add(new Interval(start, end));
        return list;
    }
}