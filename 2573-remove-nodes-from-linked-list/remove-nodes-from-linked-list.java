
class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode forward=null;
        while(curr!=null){
            forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            if(st.isEmpty()||temp.val<=st.peek().val){
                st.push(temp);
                temp=temp.next;
            }
            else if(temp.val>st.peek().val){
                while(st.size()>0 && st.peek().val<temp.val){
                    st.pop();
                }
                st.push(temp);
                temp=temp.next;
            }
        }
        ListNode dummy=new ListNode(-1);
        ListNode t1=dummy;
        while(st.size()!=0){
            t1.next=st.pop();
            t1=t1.next;
        }
        t1.next=null;
        dummy.next=reverse(dummy.next);
        return dummy.next;
    }
}