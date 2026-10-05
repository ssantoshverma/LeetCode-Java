class Solution {
    public int scoreOfParentheses(String s) {
        int score=0;
        int depth=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                depth++;
            }
            else{
                depth--;
                if(s.charAt(i-1)=='('){
                    score+=(int)Math.pow(2,depth);
                }
            }
        }
        return score;
    }
}