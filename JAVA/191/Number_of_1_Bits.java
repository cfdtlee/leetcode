//Bit manipulation https://en.wikipedia.org/wiki/Bit_manipulation
//The signed left shift operator "<<" shifts a bit pattern to the left, and the signed right shift operator ">>" shifts a bit pattern to the right. The bit pattern is given by the left-hand operand, and the number of positions to shift by the right-hand operand. The unsigned right shift operator ">>>" shifts a zero into the leftmost position, while the leftmost position after ">>" depends on sign extension.
public class Number_of_1_Bits {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int result = 0;
        // while(n>0) {
        //     result += n % 2;
        //     n /= 2;
        // }
        while(n != 0) { //can't use n>0!!
            result += n & 1;
            n >>>= 1; //can't use n >>= 1
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }
}