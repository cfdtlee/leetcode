// similiar to 141, linked list cycle
public class Happy_Number {
    public boolean isHappy(int n) {
        int result = 0, num = 15;
        while(num-- > 0) {
            result = add_power(n);
            if(result == 1) {
                return true;
            }
            if(result == 4) {
                return false;
            }
            n = result;
        }
        return false;
    }
    public static int add_power(int a) {
        int result = 0;
        while(a > 0) {
            result += (a % 10) * (a % 10);
            a /= 10;
        }
        return result;
    }

}

