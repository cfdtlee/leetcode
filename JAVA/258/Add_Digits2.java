// A naive implementation of the above process is trivial. Could you come up with other methods?
// What are all the possible results?
// How do they occur, periodically or randomly?
public class Add_Digits2 {
    public static int addDigits(int num) {
        int result = 0;
        int rest = num % 9;
        result = rest == 0 & num != 0? 9 : rest;
        return result;
    }
    public static void main(String[] args) {
    	System.out.println(addDigits(0));
    }
}