class Solution {
  
    public int addDigits(int num) {
        if(num==0) return 0;
       while(num/10 !=0){
        int digit=num%10;
        num=num/10;
        num+=digit;
       }
       return num; 
    }
}