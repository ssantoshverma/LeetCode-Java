class Solution {
    public int minAddToMakeValid(String s) {
      Stack<Character> st=new Stack<>();
      int count=0;
      int count1=0;
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='('){
            st.push(c);
            count++;
        }
        else{
            if(st.size()==0 && c!='('){
                count1++;
            }
            else{
                st.pop();
                count--;
            }
        }
      }  
      return count+count1;
    }
}