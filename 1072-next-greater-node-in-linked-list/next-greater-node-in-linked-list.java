
class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
    public int[] nextLargerNodes(ListNode head) {
       int len=0;
       ListNode temp=head;
       while(temp!=null){
        temp=temp.next;
        len++;
       } 
       head=reverse(head);
       int[] ans=new int[len];
       int idx=len-1;
       temp=head;
       Stack<Integer> st=new Stack<>();
       while(temp!=null && idx>=0){
            int val=temp.val;
            while(st.size()>0 && val>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                ans[idx]=0;
            }
            else{
                ans[idx]=st.peek();
            }
            idx--;
            st.push(temp.val);
            temp=temp.next;
       }
       return ans;
    }
}