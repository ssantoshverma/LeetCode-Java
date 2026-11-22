class Solution {
    public boolean checkString(String s) {
      boolean occured=false;
      for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='b'){
                occured=true;
            }
            if(occured&&c=='a'){
                return false;
            }
      }  
      return true;
    }
}