


/*
You are given two linked lists representing two non-negative numbers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/

/*
class Soltuion{
	public static class ListNode{
		int val;
		ListNode next;
		ListNdoe(int x){
			val = x;
			next = null;

		}
	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		ListNode dummy = new ListNode;
		ListNode curr = dummy;

		int carry = 0;
		while(l1!=null || l2!=null){
			int digit = ((l1!=null)?l1.val:0) + ((l2!=null)?l2.val:0)+carry;
			carry = digit/10;
			curr.next = new ListNode(digit % 10);
			if(l1!=null){l1 = l1.next;}
			if(l2!=null){l2 = l2.next;}
			curr = curr.next;

		}

		if(carry>0){curr.next = new ListNode(carry);}
		return dummy.next;

	}
}
*/

public class LinkedList {
	Node head;
	static class Node {
		int data;
		Node next;

		Node(){
			data = 0;
			next =null;
		}
		Node(int d){
			data = d;
			next = null;
		}
	}

	LinkedList(){
		head = null;
	}

	LinkedList(Node new_head){
		head = new_head;
	}

	public static LinkedList insert(LinkedList list, int data){
		Node new_node = new Node(data);
		new_node.next = null;

		if(list.head == null){
			list.head = new_node;
		}
		else{
			Node last = list.head;
			while(last.next!=null){
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}

	public static void printList(LinkedList list){
		Node currNode = list.head;
		System.out.println("LinkedList: ");
		while(currNode !=null){
			System.out.print(currNode.data + " ");

			currNode = currNode.next;
		}
		System.out.println(" ");
	}

	public static Node addTwoNumbers(Node l1, Node l2){
		Node dummy = new Node();
		Node curr = dummy;

		int carry = 0;
		while(l1!=null || l2!=null){
			int digit = ((l1!=null)?l1.data:0) + ((l2!=null)?l2.data:0)+carry;
			carry = digit/10;
			curr.next = new Node(digit % 10);
			if(l1!=null){l1 = l1.next;}
			if(l2!=null){l2 = l2.next;}
			curr = curr.next;

		}

		if(carry>0){curr.next = new Node(carry);}
		return dummy.next;

	}

	public static void main(String[] args){
		LinkedList list1 = new LinkedList();
		for(int i =0;i<6;i++){
			list1 = insert(list1,i);
		}
		printList(list1);
	
		LinkedList list2 = new LinkedList();
		for(int i =5;i<10;i++){
			list2 = insert(list2,i);
		}
		printList(list2);
		System.out.println("Add two linked lists: ");
		Node result = addTwoNumbers(list1.head, list2.head);
		LinkedList list3 = new LinkedList(result);
		printList(list3);

	}
}
