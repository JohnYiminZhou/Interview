/*
Reverse a linked list.
You should have two methods:
1. Iterative
2. Recursive

Idea:
1. Initialize three pointers prev as null, curr as head and next as null
2. Iterate through the linked list. In loop, do following:
    Before changing next of current
    store next node
    Now change next of current
    This is where actual reversing happens
    move pre and curr one step forward

In general, move the arrow of each node.

*/


class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
    Node(){
        data = 0;
        next = null;
    }

    Node(int val){
        data = val;
        next = null;
    }
    }

    LinkedList(){
        Node head = null;
    }

    LinkedList(Node temp){
        Node head = temp;
    }

    public LinkedList insert(LinkedList list, int num){
        Node temp = new Node(num);
        Node curr = list.head;

        if(list.head ==null){
            list.head = temp;
        }
        else{
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = temp;            
        }
        return list;

    }

    public static void printList(LinkedList list){
        Node curr = list.head;
        while(curr!=null){
            System.out.println(curr.data);
            curr = curr.next;
        }
        
    }

    public static LinkedList ReverseInterative(LinkedList list){
        if(list.head==null){
            return list;
        }
        if(list.head.next==null){
            return list;
        }
        
        Node prev = null, curr = list.head, next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        list.head = prev;
        
        return list;
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        for(int i = 0; i<10;i++){
            list = list.insert(list, i);
        }
        System.out.println("Original list:");
        printList(list);
        System.out.println("After reverse:");
        LinkedList list2 = ReverseInterative(list);
        printList(list2);

    }
  
}
