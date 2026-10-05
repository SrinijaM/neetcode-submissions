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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode t1,t2, dummy,dummy2;
        t1=list1;t2=list2;dummy=new ListNode(-1);dummy2=dummy;

        while(t1!=null&&t2!=null){
            if(t1.val<t2.val)
            {dummy.next=t1;
            dummy=t1;
            t1=t1.next;}
            else{
                dummy.next=t2;
                dummy=t2;
                t2=t2.next;
            }

        }
        if(t1==null)
        dummy.next=t2;

        else
        dummy.next=t1;
        return dummy2.next;
    }
}