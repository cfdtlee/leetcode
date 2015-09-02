//"pwwkew"; "aab"; "c"; "aa"; "cdd"
import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {
	public static int lengthOfLongestSubstring(String s) {
		int begin = 0, end = 0;
		char c;
		int max = s.length() > 0? 1:0;
		for(end = 0; end < s.length(); end++) {
			c = s.charAt(end);
			for(int i = begin; i < end; i++) {
				if(c == s.charAt(i)) {
					begin = i+1;
					// max = (end - begin +1) > max? (end - begin + 1): max;
				}
			}
			max = (end - begin +1) > max? (end - begin + 1): max;
		}

		return max;
	}
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("caa"));
	}
}