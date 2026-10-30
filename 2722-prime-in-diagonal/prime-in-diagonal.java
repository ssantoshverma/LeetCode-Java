class Solution {
    boolean isPrime(int n) {
    if (n <= 1) return false;

    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }

    return true;
}
    public int diagonalPrime(int[][] nums) {
        int row=nums.length;
        int col=nums[0].length;
        int ans=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j ||(i+j==row-1)){
                    boolean check=isPrime(nums[i][j]);
                        if(check){
                            ans=Math.max(ans,nums[i][j]);
                        }
                    
                }
            }
        }
        return ans;
    }
}