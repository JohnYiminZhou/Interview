/*

输入一棵二元查找树，将该二元查找树转换成一个排序的双向链表。
要求不能创建任何新的结点，只调整指针的指向。
10
/ \
6 14
/ \ / \
4 8 12 16
转换成双向链表
4=6=8=10=12=14=16。

First of all, we need to build a BST in java.

*/

public class Solution{
	private Node head, tail; // Only this package can access this filed.

	public static class Node(
		private int value;
		private Node leftNode;
		private Node rightNode;
		public Node(int value, Node leftNode, Node rightNode){
			//why use "this", have u ever consider about it?
			/*
			this keyword in java can be used inside the Method or constructor of Class. 
			It(this) works as a reference to the current Object, whose Method or constructor is being invoked. 
			This keyword can be used to refer to any member of the current object from within an instance Method or a constructor.
			Can u be more specific? Give an example?
			It(this) works as a reference to the current Object.
			*/
			this.value = value;
			this.leftNode = leftNode;
			this.rightNode = rightNode;

		}

		)
	public void traversal(Node node){
		if(node ==null)return;
		if(node.leftNode!=null) traversal(node.leftNode);
		changeNode(node);
		if(node.rightNode!=null) traversal(node.rightNode);

	}
	private void changeNode(Node node) {
		if(head == null){
			head = node;
			tail = node;
		}
		else{
			node.leftNode = tail;
			tail.rightNode = node;
			tail = node;

		}

		private void printHead(){
			while(head!=null){
				System.out.print(head.value+" ");
				head = head.rightNode;
			}

		private void printTail(){
			while(tail!=null){
				System.out.print(tail.value+" ");
				tail = tail.leftNode;
			}
		}
		Public static void main(String args) {
			
		}
		}
















	}
}
