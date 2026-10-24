class Solution {
    public int dayNo(String date){
        String[] parts=date.split("-");
        int total=0;
        int month=Integer.valueOf(parts[0]);
        int days=Integer.valueOf(parts[1]);
         for(int i=1;i<month;i++){
            if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                total+=31;
            }
            else if(i==4||i==6||i==9||i==11){
                total+=30;
            }
            else{
                total+=28;
            }
        }
        total+=days;
        return total;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        boolean[] together=new boolean[366];
        int aArrive=dayNo(arriveAlice);
        int aLeave=dayNo(leaveAlice);
        int bArrive=dayNo(arriveBob);
        int bLeave=dayNo(leaveBob);
        for(int i=aArrive;i<=aLeave;i++){
            together[i]=true;
        }
        int count=0;
        for(int i=bArrive;i<=bLeave;i++){
            if(together[i]){
                count++;
            }
        }
        return count;
    }
}