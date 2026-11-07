class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
     HashSet<Character> set=new HashSet<>();
     int i=0;
     int j=0;
     int maxCount=0;
     while(j<s.length()){
        if(!set.contains(s.charAt(j))){
            set.add(s.charAt(j));
            j++;
        }
        else{
            int count=j-i;
            maxCount=Math.max(maxCount,count);
            set.remove(s.charAt(i));
            i++;
        }
     }   
     int count=j-i;
      maxCount=Math.max(maxCount,count);
     return maxCount;
    }
}