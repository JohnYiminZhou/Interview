/*

Given a linked list, remove the nth node from the end of list and return its head.
For example,
   Given linked list: 1->2->3->4->5, and n = 2.
   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.

*/

class Soltuion{
	public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    
    int gap = n;
    ListNode prev = dummy, curr = dummy;
    while (curr.next != null) {
        if (gap > 0) {
            gap--;
        } else {
            prev = prev.next;
        }
        curr = curr.next;
        
        if (curr.next == null) prev.next = prev.next.next;
    }
    return dummy.next;
}
}