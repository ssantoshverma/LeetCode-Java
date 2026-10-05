class Solution {
    public boolean selfDividing(int n){
        int x=n;
        while(x!=0){
            int digit=x%10;
            if(digit==0||n%digit!=0) return false;
            else{
                x=x/10;
            }

        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
       List<Integer> ans=new ArrayList<>();
       for(int i=left;i<=right;i++){
            if(selfDividing(i)) ans.add(i);
       } 
       return ans;
    }
}