class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0;
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]>k){
                j--;
            }
            else if(nums[i]+nums[j]<k){
                i++;
            }
            else{
                count++;
                j--;
                i++;
            }
        }
        return count;
    }
}