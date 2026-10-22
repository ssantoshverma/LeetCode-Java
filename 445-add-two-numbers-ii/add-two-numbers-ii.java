
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummy=new ListNode(-1);
      ListNode temp=dummy;
      ListNode t1=reverse(l1);
      ListNode t2=reverse(l2);
      int carry=0;
      while(t1!=null && t2!=null){
            int sum=carry;
            sum+=t1.val+t2.val;
            carry=sum/10;
            sum=sum%10;
            ListNode n=new ListNode(sum);
            temp.next=n;
            temp=temp.next;
            t1=t1.next;
            t2=t2.next;
      } 
      if(t1!=null){
        while(t1!=null){
            int sum=carry;
            sum+=t1.val;
            carry=sum/10;
            sum=sum%10;
            ListNode n=new ListNode(sum);
            temp.next=n;
            temp=temp.next;
            t1=t1.next;
        }
      } 
      else{
        while(t2!=null){
            int sum=carry;
            sum+=t2.val;
            carry=sum/10;
            sum=sum%10;
            ListNode n=new ListNode(sum);
            temp.next=n;
            temp=temp.next;
            t2=t2.next;
        }
      }
      if(carry>0){
        ListNode n=new ListNode(carry);
        temp.next=n;
        temp=temp.next;
      }
      return reverse(dummy.next);
    }
}