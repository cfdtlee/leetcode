// Since The majority element is the element that appears more than ⌊ n/2 ⌋ times, we dont need to consider other num that apper less than ⌊ n/2 ⌋.
// so there are two kinds of the num: more than ⌊ n/2 ⌋ and less than ⌊ n/2 ⌋
public class Unique_Binary_Search_Trees {
    public static int numTrees(int n) {
        int[] s = new int[n+1];
        s[0] = s[1] = 1;
        for(int i = 2; i <= n; i++) {
            for(int j = 0; j < i; j++) {
                s[i] += s[j]*s[i-j-1];
                // System.out.println(s[j]);
                // System.out.println("s[i]");
                // System.out.println(s[i]);
            }
            
        }
        return s[n];
    }
    public static void main(String[] args) {
        System.out.println(numTrees(4));
    }
}