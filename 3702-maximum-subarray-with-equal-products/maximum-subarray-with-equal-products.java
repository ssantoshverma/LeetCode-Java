class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int lcm(int a,int b){
        return (a/gcd(a,b))*b;
    }
    public int maxLength(int[] nums) {
        int maxLength=0;
       for(int i=0;i<nums.length;i++){
        long prod=1;
        long Gcd=0;
        long Lcm=1;
        for(int j=i;j<nums.length;j++){
            prod=prod*nums[j];
            Gcd=gcd((int)Gcd,nums[j]);
            Lcm=lcm((int)Lcm,nums[j]);
            if(prod==Gcd*Lcm){
                int length=j-i+1;
                maxLength=Math.max(length,maxLength);
            }
        }
       }
       return maxLength; 
    }
}