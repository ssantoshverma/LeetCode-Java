class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
      boolean[] bulb=new boolean[101];
      for(int i=0;i<bulbs.size();i++){
        int bulbNo=bulbs.get(i);
        if(bulb[bulbNo]){
            bulb[bulbNo]=false;
        }
        else{
            bulb[bulbNo]=true;
        }
      }  
      List<Integer> ans=new ArrayList<>();
      for (int i = 1; i <= 100; i++) {
            if (bulb[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}