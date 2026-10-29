class Solution {
    public int myAtoi(String s) {
       long ans=0;
       int i=0;
       int n=s.length();
       while(i<n && s.charAt(i)==' '){
        i++;
       } 
       boolean negative=false;
       if(i<n &&(s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i)=='-'){
                negative=true;
            }
            i++;
       }
       while(i<s.length() && Character.isDigit(s.charAt(i))){
        int digit=s.charAt(i)-'0';
        ans=ans*10+digit;
        if(!negative && ans>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else if(negative && -ans<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        i++;
       }
       if(negative){
        return -(int)ans;
       }
       else{
        return (int)ans;
       }
    }
}