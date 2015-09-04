public class Excel_Sheet_Column_Number {
    public static int titleToNumber(String s) {
        int n = 0;
        for(int i = 0; i < s.length(); i++) {
        	n = n * 26 + s.charAt(i) - 'A' + 1;
        	System.out.println(n);
        }
        return n;
    }
    public static void main(String[] args) {
    	System.out.println(titleToNumber("AA"));
    }
}