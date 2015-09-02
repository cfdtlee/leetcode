// A naive implementation of the above process is trivial. Could you come up with other methods?
// What are all the possible results?
// How do they occur, periodically or randomly?
public class Add_Digits {
    public static int addDigits(int num) {
        int result = 0;
        for(;;) {
        	while(num > 0) {
        		result += num % 10;
        		num /= 10;
        		// System.out.println(num);
        	}
        	if(result > 9) {
        		num = result;
        		result = 0;
        		continue;
        	}
        	break;
        }
        
        return result;
    }
    public static void main(String[] args) {
    	System.out.println(addDigits(99));
    }
}