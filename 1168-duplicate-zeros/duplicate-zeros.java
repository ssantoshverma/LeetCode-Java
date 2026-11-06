class Solution {
    public void duplicateZeros(int[] arr) {
      int n=arr.length;
      int i=0;
      int k=0;
      int[] ans=new int[n];
      while(i<n && k<n){
        if(arr[i]!=0){
            ans[k]=arr[i];
            k++;
            i++;
        }
        else{
            ans[k++]=arr[i];
            if(k<n){
                ans[k++]=0;
            }
            i++;
        }
      } 
      i=0;
      while(i<n){
        arr[i]=ans[i];
        i++;
      }
    }
}