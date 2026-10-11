class Solution {
    public int sumOfSquares(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int index=i+1;
            if(n%index==0){
                ans+=(nums[i]*nums[i]);
            }
        }
        return ans;
    }
}