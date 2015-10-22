/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
public class Solution {
    public int maxPoints(Point[] points) {
        if(points.length <= 2) return points.length;
        Map<Integer, Map<Integer, Integer>> map = new HashMap<Integer, Map<Integer, Integer>>();
        int res = 0, gcd;
        for(int i = 0; i < points.length; i++) {
            int overlap = 0, max = 0;
            map.clear();
            for(int j = i+1; j < points.length; j++) {
                int x = points[j].x - points[i].x;
                int y = points[j].y - points[i].y; // j
                if(x == 0 && y == 0) { //
                    overlap++;
                    continue;
                }
                gcd = getGcd(x, y);
                if(gcd != 0) {
                    x /= gcd;
                    y /= gcd;
                }
                if(!map.containsKey(x)) {
                    Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
                    tempMap.put(y, 1);
                    map.put(x, tempMap);
                }
                else if(!map.get(x).containsKey(y)) { //
                    map.get(x).put(y, 1);  //
                }
                else {
                    map.get(x).put(y, map.get(x).get(y)+1);
                }
                max = Math.max(max, map.get(x).get(y));
            }
            res = Math.max(res, max + overlap + 1); // +1
        }
        return res;
    }
    int getGcd(int a, int b) {
        if(b == 0) return a;
        else return getGcd(b, a%b);
    }
}