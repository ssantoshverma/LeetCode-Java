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
        List<List<String>> result=new ArrayList<>();
        boolean []visited=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(visited[i])continue;
            else{
                List<String> group=new ArrayList<>();
                group.add(strs[i]);
                visited[i]=true;
                int[] freq1=frequency(strs[i]);
                for(int j=i+1;j<strs.length;j++){
                    if(visited[j]) continue;
                    else{
                        int[] freq2=frequency(strs[j]);
                        if(Arrays.equals(freq1,freq2)){
                            group.add(strs[j]);
                            visited[j]=true;
                        }
                    }
                }
                result.add(group);
            }
            
        }
        return result;
    }
}