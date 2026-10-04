class Solution {
    public int minRotations(String s) {
      int ans=0;
        int prev=0;
        for(int i=0;i<s.length();i++){
            int curr=s.charAt(i)-'0';
            int direct=Math.abs(curr-prev);
            int circular=10-direct;
            ans+=Math.min(direct,circular);
            prev=curr;
        }
        return ans;
    }
}