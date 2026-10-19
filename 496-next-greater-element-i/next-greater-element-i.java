class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums2.length;
        int[] nge=new int[n];
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && st.peek()<nums2[i]){
                st.pop();
            }
            if(st.size()==0){
                nge[i]=-1;
                st.push(nums2[i]);
            }
            else{
                nge[i]=st.peek();
                st.push(nums2[i]);
            }
        }
        for(int i=n-1;i>=0;i--){
            map.put(nums2[i],nge[i]);
        }
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int ele=nums1[i];
            int ge=map.get(ele);
            ans[i]=ge;
        }
        return ans;
    }
}