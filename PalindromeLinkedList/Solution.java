package PalindromeLinkedList;
/*

Given a singly linked list, determine if it is a palindrome.


*/

class Solution {
    public class Node {
        int data;
        Node next;
        Node(int d){
            data = d;
        }
    }

    public boolean PalindromeLinkedList(Node head){
        if(head == null) {
            return true;}
        Node slow = head, fast = head;
        while(fast.next !=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;

        }
        fast = slow.next;
        while (fast !=null && fast.next !=null){
            Node nd = fast.next.next;
            fast.next.next = slow.next;
            slow.next = fast.next;
            fast.next = nd;
        }

        while (slow.next!=null){
            slow = slow.next;
            if(head.data !=slow.data) return false;
            head = head.next;
        }
        return true;
        }
    }
}