import java.util.*;
class Solution {
    static Scanner sc=new Scanner(System.in);
    public boolean isPalindrome(int x) {
       
       int n=x,sum=0;
       
           while(n>0){
           int r=n%10;
           sum=sum*10+r;
           n=n/10;
           }
        
            if(sum==x){
                return true;
            }
            
                return false;
            
     
       }
    

}