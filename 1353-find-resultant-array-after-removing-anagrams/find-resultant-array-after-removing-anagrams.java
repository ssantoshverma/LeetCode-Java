class Solution {
    public int[] frequency(String s){
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
        }
        return freq;
    }
    public List<String> removeAnagrams(String[] words) {
      List<String> ans=new ArrayList<>();
     String prev="";
     for(String word:words){
        if(ans.isEmpty()||!Arrays.equals(frequency(prev),frequency(word))){
            ans.add(word);
            prev=word;
        }
     }
     return ans;
    }
}