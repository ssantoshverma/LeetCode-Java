class Solution {
    public long maxAlternatingSum(int[] nums) {
      int n=nums.length;
      int[] arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=Math.abs(nums[i]);
      }  
      Arrays.sort(arr);
      long ans=0;
      for(int i=n-1;i>=0;i--){
        long square = (long) arr[i] * arr[i];
        if(i>=n/2){
            ans+=square;
        }
        else{
            ans-=square;
        }
      }
     return ans;
    }
}