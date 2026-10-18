class Solution {
    public boolean checkIfExist(int[] arr) {
      HashSet<Integer> set=new HashSet<>();
      for(int ele:arr){
        set.add(ele);
      } 
      for(int i=0;i<arr.length;i++){
        if(arr[i]==0) continue;
        int twice=2*arr[i];
        if(set.contains(twice)) return true;
      } 
      int zeros=0;
      for(int ele:arr){
        if(ele==0){
            zeros++;
        }
      }
      return zeros>=2;
    }
}