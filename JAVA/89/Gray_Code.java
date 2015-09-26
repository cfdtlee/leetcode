// How to use back tracking?
public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(0);
        for(int i = 2; i < (int)Math.pow(2, n) + 1; i++) {
            int k = (int) Math.ceil(Math.log((double)(i)) / Math.log(2)) - 1; // find pre
            int pre = (int)Math.pow(2, k);
            int d = i - pre;
            int base = pre - d + 1;
            result.add(result.get(base) + (1 << k));
        }
        result.remove(0);
        return result;
    }
}

// update version
public List<Integer> grayCode(int n) {
    List<Integer> result = new LinkedList<>();
    for (int i = 0; i < 1<<n; i++) result.add(i ^ i>>1);
    return result;
}

public class Solution {
    public static List<Integer> grayCode(int n) {
        
    }
}