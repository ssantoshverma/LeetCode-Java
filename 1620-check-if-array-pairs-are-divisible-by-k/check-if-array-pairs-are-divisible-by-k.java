class Solution {
    public boolean canArrange(int[] arr, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        int ele=arr[i]%k;
        if(ele<0){
            ele+=k;
            ele=ele%k;
        }
        map.put(ele,map.getOrDefault(ele,0)+1);
       } 
       if(map.containsKey(0)){
        int freq=map.get(0);
        if(freq%2!=0) return false;
        map.remove(0);
       }
       
       for(int ele:map.keySet()){
        int key=ele;
        int rem=k-key;
        if(!map.containsKey(rem)) return false;
        int keyFreq=map.get(key);
        int remFreq=map.get(rem);
        if(keyFreq!=remFreq) return false;
       }
       return true;
    }
}