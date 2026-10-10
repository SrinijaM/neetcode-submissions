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
        private static class NodeComparator
        implements Comparator<ListNode> {

        // Gives smaller values higher heap priority.
        public int compare(ListNode first, ListNode second) {
            return Integer.compare(first.val, second.val);
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode merged =null;
        PriorityQueue<ListNode> minHeap=new PriorityQueue<>(new NodeComparator());

        for(ListNode head:lists){
            if(head!=null)
           minHeap.offer(head);
        }
        merged=sort(minHeap);
        return merged;

    }
    ListNode sort(PriorityQueue<ListNode> minHeap){
         ListNode dummy= new ListNode(-1);
        ListNode tail=dummy;
        
        while(!minHeap.isEmpty()){
                ListNode small=minHeap.poll(); //poll minimum of the heads
                tail.next=small; //adding smallest value to dummy node or list
                tail=tail.next; //moving smallest so next node can be added after smallest

                if(small.next!=null) // check so that while stops when PQ is empty
                minHeap.offer(small.next); //and next one as head so minimum of heads can be selected
        }

        return dummy.next;

    }
}
