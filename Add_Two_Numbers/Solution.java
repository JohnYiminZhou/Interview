/*
Given two numbers represented by two lists, 
write a function that returns sum list. 
The sum list is list representation of addition of two input numbers.


*/





class Solution{

    
        static Node head1, head2;
        //Inside the linkedlist, there is a node
        //structure
        class Node{
            int data;
            Node next;

            Node(int d){
                data = d;
                next = null;
            }
        }
    
    Node addTwoLists(Node first, Node second){
        Node res = null;
        Node prev = null;
        Node temp = null;
        int carry = 0, sum;

        while(first !=null || second != null){
            sum = carry + (first !=null ?first.data:0)
            + (second!= null ? second.data:0);
            
            carry = (sum>=10)?1:10;
            sum = sum%10;
            temp = new Node(sum);

            if(res == null){
                res = temp;
            }
            else{
                prev.next = temp;
            }

            prev = temp;

            if(first!=null) first = first.next;
            if(second!=null) second = second.next;
            if(carry>0){
                temp.next = new Node(carry);

            }

            


        }
        return res;
    }


}