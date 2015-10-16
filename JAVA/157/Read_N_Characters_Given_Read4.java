/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
    public int read(char[] buf, int n) {
        int bufPtr = 0;
        int bufCnt = 0;
        int ptr = 0;
        char[] innerBuf = new char[4];
        while(ptr < n) {
            if(bufPtr == 0) {
                bufCnt = read4(innerBuf);
            }
            if(bufCnt == 0) break;
            while(ptr < n && bufPtr < bufCnt) {
                buf[ptr++] = innerBuf[bufPtr++];
            }
            if(bufPtr >= bufCnt) bufPtr = 0;
        }
        return ptr;
    }
}