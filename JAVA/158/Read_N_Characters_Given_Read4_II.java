/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    int bufCnt = 0;
    int bufPtr = 0;
    char[] innerBuf = new char[4];
    public int read(char[] buf, int n) {
        int ptr = 0;
        while(ptr < n) { //not be filled up
            if(bufPtr == 0) { //innerBuf is empty
                bufCnt = read4(innerBuf); //recharge
            }
            if(bufCnt == 0) {// EOF
                break;
            }
            while(ptr < n && bufPtr < bufCnt) {
                buf[ptr++] = innerBuf[bufPtr++];
            }
            if(bufPtr >= bufCnt) {
                bufPtr = 0;
            }
        }
        return Ptr;
    }
}