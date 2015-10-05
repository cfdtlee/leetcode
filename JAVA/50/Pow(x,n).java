public class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        double ele = x, result = x;
        long nn = n;
        if(n < 0) {
            ele = 1/x;
            result = ele; 
            nn = -nn;
        }
        while(nn > 1) {
            if(nn % 2 == 0) {
                nn /= 2;
                result *= ele; // order?
                ele *= ele;
            }
            else{
                nn -= 1;
                result *= ele;
            }
        }
        return result;
    }
}

public class Solution {
    public double myPow(double x, int n) {
        double result;
        if(n < 0) {n = -n; x = 1/x;}
        if(n == 0) {return 1;}
        if(n == 1) {return x;}
        if(n % 2 == 0) {
            result = myPow(x, n/2);
            return result * result;
        }
        else {
            return myPow(x, n-1) * x;
        }
    }
}


public class Solution {
    public double pow(double x, int n) {
        if(n == 0)
            return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        return (n%2 == 0) ? pow(x*x, n/2) : x*pow(x*x, n/2);
    }
}
