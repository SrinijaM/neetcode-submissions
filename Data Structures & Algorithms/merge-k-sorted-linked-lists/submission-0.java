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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode merged =null;

        for(ListNode head:lists){
            merged=sort(merged,head);
        }
        return merged;

    }
    ListNode sort(ListNode merged,ListNode head){
        // if(merged==null) return head;

        ListNode dummy= new ListNode(-1);
        ListNode dummy2=dummy;

        while(merged!=null&&head!=null){
            if(merged.val<head.val){
                dummy.next=merged;
                merged=merged.next;
                dummy=dummy.next;
            }
            else{
                dummy.next=head;
                dummy=dummy.next;
                head=head.next;
            }

        }
        if(merged!=null)
        dummy.next=merged;

        else
        dummy.next=head;

        return dummy2.next;

    }
}
