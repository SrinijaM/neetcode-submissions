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
    public void reorderList(ListNode head) {
        ListNode front=head, end=head;
        ListNode slow=head,fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        end=reverse(slow);

        f(front,end);
    }
    void f(ListNode front,ListNode end){
        if(front==null||end==null) {
            if(front!=null) end =front;
            return;
        }
           

        ListNode temp=front.next;
        front.next=end;
        ListNode temp2=end.next;
        end.next=temp;
        f(temp,temp2);

    }
    ListNode reverse(ListNode front){
        ListNode prev=null;
        while(front!=null){
            ListNode temp2=front.next;
            front.next=prev;
            prev=front;
            front=temp2;
        }
        return prev;
    }
}
