/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

*/
import java.io.*;
import java.util.*;

class Solution{
    class Node{
        int data;
        Node next;

        Node(int num){
            data =num;
            next = null;
        }

    }
    //add new node to the end of the linked list.
    void add(Node head, int num){
        Node temp = new Node(num);
        if(head == null){
            head = temp;
            return;
        }
        else{
            Node last = head;
            while(last!=null){
                last = last.next;
            }
            last.next = temp;
            return;
        }
    }

    Node addTwoList(Node l1, Node l2){
        Node prev = new Node(0);
        Node head = prev;
        int carry = 0;
        while(l1!=null || l2!=null || carry!=0){
            Node curr = new Node(0);
            int sum = ((l2==null)?0:l2.data)+((l1==null)?0:l1.data)+carry;
            curr.data = sum%10;
            prev.next = curr;
            prev = curr;

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;

        }
        return head.next;


    }

    Node MyAdd(Node l1, Node l2){
        Node head, node;
        int carry = 0, remainder =0, sum = 0;
        head = node = new Node(0);
        while(l1!=null || l2!=null || carry!=0){
            sum =(l1!=null?l1.data:0)+ (l2!=null?l2.data:0) + carry;
            carry = sum/10;
            remainder = sum%10;
            node = node.next = new Node(remainder);
            l1 = (l1!=null? l1.next: null);
            l2 = (l2!=null? l2.next :null);
        }


        
        return head.next;
    }



}


