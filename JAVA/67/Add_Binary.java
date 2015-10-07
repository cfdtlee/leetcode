public class Solution {
    public String addBinary(String a, String b) {
        if(a.length() < b.length()) {return addBinary(b, a);} // make sure a is longer
        int f = 0;
        String result = "";
        int bl = b.length(), al = a.length();
        for(int i = 1; i <= bl; i++) {
            System.out.println(bl);
            f += (Character.getNumericValue(b.charAt(bl-i)) + Character.getNumericValue(a.charAt(al-i)));
            if(f % 2 != 0) {
                result = "1" + result;
                f -= 1;
            }
            else {
                result = "0" + result;
            }
            f /= 2;
        }
        for(int i = bl+1; i <= al; i++) {
            f += Character.getNumericValue(a.charAt(al-i));
            if(f % 2 != 0) {
                result = "1" + result;
                f -= 1;
            }
            else {
                result = "0" + result;
            }
            f /= 2;
        }
        if(f == 1) {
            result = "1" +result;
        }
        return result;
    }
}