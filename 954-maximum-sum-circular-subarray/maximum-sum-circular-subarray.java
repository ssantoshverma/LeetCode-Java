class Solution {
    public int maxSubarraySumCircular(int[] nums) {
      int currentSum=nums[0];
      int maxSum=nums[0];
      for(int i=1;i<nums.length;i++){
        currentSum=Math.max(nums[i],currentSum+nums[i]);
        maxSum=Math.max(currentSum,maxSum);
      }  
      currentSum=nums[0];
      int minSum=nums[0];
      for(int i=1;i<nums.length;i++){
        currentSum=Math.min(nums[i],currentSum+nums[i]);
        minSum=Math.min(currentSum,minSum);
      }
      int totalSum=nums[0];
      for(int i=1;i<nums.length;i++){
        totalSum+=nums[i];
      }
      if(maxSum<0){
        return maxSum;
      }
      return Math.max(maxSum,totalSum-minSum);
    }
}