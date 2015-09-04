//Bit manipulation https://en.wikipedia.org/wiki/Bit_manipulation
public class Number_of_1_Bits {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int result = 0;
        // while(n>0) {
        //     result += n % 2;
        //     n /= 2;
        // }
        while(n>0) {
            result += n & 1;
            n >>= 1;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }
}