/*
Given a linked list, swap every two adjacent nodes and return its head.
For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.
Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
*/
class Soltuion{
	public static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

// x 1 2 3 4
// p c
// x 2 1 3 4
//     p c
public ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    
    ListNode prev = dummy, curr = head;
    while (curr != null && curr.next != null) {
        ListNode nt = curr.next.next;
        curr.next.next = prev.next;
        prev.next = curr.next;
        curr.next = nt;
        
        prev = curr;
        curr = curr.next;
    }
    
    return dummy.next;
}
}