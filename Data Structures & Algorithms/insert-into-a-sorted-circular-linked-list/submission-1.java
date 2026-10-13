/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        if(head == null){
            Node newNode = new Node(insertVal);
            newNode.next = newNode;
            return newNode;
        }
        Node curr = head;
        while(curr.next != head){
            Node next = curr.next;
            if(curr.val <= next.val){
                if(insertVal >= curr.val && insertVal <= next.val){
                    Node newNode = new Node(insertVal);
                    newNode.next = next;
                    curr.next = newNode;
                    return newNode;
                }
            }else{
                if(insertVal >= curr.val || insertVal <= next.val){
                    Node newNode = new Node(insertVal);
                    newNode.next= next;
                    curr.next = newNode;
                    return newNode;
                }
            }
            curr = curr.next;
        }
        Node newNode = new Node(insertVal);
        newNode.next = curr.next;
        curr.next = newNode;
        return newNode;
    }
}
