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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode end =head;
        ListNode ans=head;
        int length=1;
        while(end.next!=null){
            
            end=end.next;
            length++;
        }
        int index=length-n+1;
        end=head;
        int counter=1;
         // If we need to remove the first node
        if (index == 1) {
            return head.next;
        }
        //if(length==index) return null;

        while(end.next!=null){

            if(counter+1==index){
                ListNode temp=end.next.next;
                end.next=temp;
                break;
            }
            end=end.next;
            counter++;
        }

        return ans;
    }
}
