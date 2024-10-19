class Solution {
    public double myPow(double x, int n) {
        
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if (n == Integer.MIN_VALUE) {
            return myPow(x, n + 1) / x;
        }
        if(n<0){
              
            x=1/x;
            n=-n;
        }
        
        double pow = myPow(x,n/2);
        if(n%2==0){
            return pow*pow;
            
        }
        else{
            return x*pow*pow;
        }
    }
}