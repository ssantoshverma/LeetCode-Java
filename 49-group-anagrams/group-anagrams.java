class Solution {
    public int[] frequency(String word){
        int[] freq=new int[26];
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            freq[c-'a']++;
        }
        return freq;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> ans=new ArrayList<>();
      int n=strs.length;
      boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]) continue;
            else{
                List<String> group=new ArrayList<>();
                group.add(strs[i]);
                visited[i]=true;
                int[] freq1=frequency(strs[i]);
                for(int j=i+1;j<n;j++){
                    if(visited[j]) continue;
                    else{
                            int[] freq2=frequency(strs[j]);
                            if(Arrays.equals(freq1,freq2)){
                                group.add(strs[j]);
                                visited[j]=true;
                            }
                    }
                }
                 ans.add(group);
            }
           
        }
        return ans;
    }
}