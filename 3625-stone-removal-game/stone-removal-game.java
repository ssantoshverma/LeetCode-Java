class Solution {
    public boolean canAliceWin(int n) {
       int stone=10;
       boolean flag=false;
       for(int i=0;n>0;i++){
        if(i%2==0){
            if(stone>n) return false;
            else{
                n=n-stone;
            }
            stone--;
            flag=true;
        }
        else{
            if(stone>n) return true;
            else{
                n=n-stone;
            }
            stone--;
            flag=false;
        }
       } 
       return flag;
    }
}