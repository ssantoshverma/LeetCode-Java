class Solution {
    public void Merge(int[] a,int[] b,int[] arr){
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                arr[k]=a[i];
                i++;
            }
            else{
                arr[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<a.length){
            arr[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            arr[k]=b[j];
            j++;
            k++;
        }
    }
    public void MergeSort(int[] arr){
        int n=arr.length;
         if (n <= 1) {
            return;
        }
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];
       int i=0;
       while(i<n/2){
        a[i]=arr[i];
        i++;
       }
       int j=0;
       while(i<n){
        b[j]=arr[i];
        i++;
        j++;
       }
        MergeSort(a);
        MergeSort(b);
        Merge(a,b,arr);
    }
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        MergeSort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans.add(i);
            }
        }
        return ans;
    }
}