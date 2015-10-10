// [0] [1] [100]
public class Solution {
    public int hIndex(int[] citations) {
        if(citations.length < 1) {return 0;}
        Arrays.sort(citations);
        int h = 0;
        for(int i = 1; i <= citations.length; i++) { 
            if(citations[citations.length - i] >= i) {
                h = i;
            }
        }
        return h;
    }
}


// [0] [1] [100]
public class Solution {
    public int hIndex(int[] citations) {
        int[] count = new int[citations.length+1];
        for(int i = 0; i < citations.length; i++) {
            if(citations[i] > citations.length) {
                count[citations.length] += 1;
            }
            else {
                count[citations[i]] += 1;
            }
        }
        int total = 0;
        for(int i = citations.length; i >= 0; i--) {
            total += count[i];
            if(total >= i) {
                return i;
            }
        }
        return 0;
    }
}