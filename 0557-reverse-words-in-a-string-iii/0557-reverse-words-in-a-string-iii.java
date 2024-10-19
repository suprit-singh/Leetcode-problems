import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String []str=s.split(" ");
        String res="";
        for(int i=0;i<str.length;i++){
            int n=str[i].length();
            for(int j=n-1;j>=0;j--){
                res+=str[i].charAt(j);
            }
            if(i<str.length-1)res+=" ";
        }
        
        return res; 
    }
}