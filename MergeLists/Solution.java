/*
Merge two sorted linked lists and return it as a new list. 
The new list should be made by splicing together the nodes of the first two lists.
no extra space, using temp value.
*/
class Soltuion{
	public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode lc1 = l1, lc2 = l2;
    ListNode dummyHead = new ListNode(0);
    ListNode p = dummyHead;
    while (lc1 != null && lc2 != null) {
        if (lc1.val < lc2.val) {
            p.next = lc1;
            lc1 = lc1.next;
        } else {
            p.next = lc2;
            lc2 = lc2.next;
        }
        p = p.next;
    }
    if (lc1 != null)    p.next = lc1;
    if (lc2 != null)    p.next = lc2;
    return dummyHead.next;
}
}