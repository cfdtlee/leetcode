import java.util.Arrays;
public class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        char[] chars1 = s.toCharArray(), chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        String ss = new String(chars1);
        String tt = new String(chars2);
        System.out.println(ss+tt);
        return ss.equals(tt);
    }
    public static void main(String[] args) {
    	System.out.println(isAnagram("aa", "aa"));
    }
}