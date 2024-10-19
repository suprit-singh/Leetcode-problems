class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        String newS="";
        String newP="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                newS=newS+s.charAt(i);
            }
        }
        for(int j=newS.length()-1;j>=0;j--){
            newP=newP+newS.charAt(j);
        }
        if(newS.equals(newP)){
            return true;
        }
        else{
            return false;
        }
    }
}