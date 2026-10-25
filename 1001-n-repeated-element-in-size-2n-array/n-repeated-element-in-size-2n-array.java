class Solution {
    public int repeatedNTimes(int[] nums) {
     int twiceN=nums.length;
     int n=twiceN/2;
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0;i<twiceN;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
     } 
     for(int i=0;i<twiceN;i++){
        int freq=map.get(nums[i]);
        if(freq==n) return nums[i];
     } 
     return 0; 
    }
}