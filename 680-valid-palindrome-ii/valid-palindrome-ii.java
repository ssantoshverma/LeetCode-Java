class Solution {
    boolean isPalindrome(int i,int j,String str){
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public boolean validPalindrome(String s) {
       int i=0;
       int j=s.length()-1;
       while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
            return isPalindrome(i,j-1,s)||
                    isPalindrome(i+1,j,s);
        }
        else{
            i++;
            j--;
        }
       } 
       return true;
    }
}