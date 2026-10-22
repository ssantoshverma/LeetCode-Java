/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
       int carry=0;
       ListNode t1=(l1);
       ListNode t2=(l2);
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
       if(t1==null&& t2!=null){
        while(t2!=null){
        int sum=carry+t2.val;
        carry=sum/10;
        sum=sum%10;
        ListNode n=new ListNode(sum);
        temp.next=n;
        temp=temp.next;
        t2=t2.next;
        }
       }
       else if(t2==null && t1!=null){
        while(t1!=null){
        int sum=carry+t1.val;
        carry=sum/10;
        sum=sum%10;
        ListNode n=new ListNode(sum);
        temp.next=n;
        temp=temp.next;
        t1=t1.next;
        }
       }
       if(carry>0){
        ListNode n=new ListNode(carry);
        temp.next=n;
        temp=temp.next;
       }
        return (dummy.next);
    }
}