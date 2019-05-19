/*
Reverse a singly linked list.
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

// iteratively
public ListNode reverseList(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    
    ListNode prev = dummy, curr = head;
    while (curr != null && curr.next != null) {
        ListNode nd = curr.next.next;
        curr.next.next = prev.next;
        prev.next = curr.next;
        curr.next = nd;
    }
    
    return dummy.next;
}
//How to do it recursively?
/*
Reverse a linked list from position m to n. Do it in-place and in one-pass.
For example:
Given 1->2->3->4->5->NULL, m = 2 and n = 4,
return 1->4->3->2->5->NULL.
Note:
Given m, n satisfy the following condition:
1 ≤ m ≤ n ≤ length of list.
*/

// 1 2 3 4, m = 3
//   p c
public ListNode reverseBetween(ListNode head, int m, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    
    ListNode prev = dummy, curr = dummy.next;
    int pos = 1;
    while (pos < m && curr != null) {
        prev = curr;
        curr = curr.next;
        pos++;
    }
    
    while (pos < n && curr != null) {
        ListNode nt = curr.next.next;
        curr.next.next = prev.next;
        prev.next = curr.next;
        curr.next = nt;
        pos++;
    }
    
    return dummy.next;
}

}