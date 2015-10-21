public class Solution {
    public String multiply(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length(), carry = 0;
        int[] prod = new int[len1 + len2];
        String res = "";
        for(int i = 0; i < len1; i++) {
            for(int j = 0; j < len2; j++) {
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';
                prod[i+j+1] += a*b;
            }
        }
        for(int i = prod.length-1; i >= 0; i--) { // when go through from end, must use i = len-1 and i--
            int t = carry + prod[i];
            prod[i] = t % 10;
            carry = t / 10;
            res = Integer.toString(prod[i]) + res;
        }
        while(res.length() > 1 && res.charAt(0) == '0') { //
            res = res.substring(1);
        }
        return res;
    }
}