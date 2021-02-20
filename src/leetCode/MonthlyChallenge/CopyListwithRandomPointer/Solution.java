package leetCode.MonthlyChallenge.CopyListwithRandomPointer;


import java.util.HashMap;
import java.util.Map;

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Solution {
    public Node copyRandomList(Node head) {

        Map<Node,Node> map = new HashMap<>();
        Node root = head;

        while(head!=null){
            map.put(head, new Node(head.val));
            head=head.next;
        }
        head=root;
        while(head!=null){

            map.get(head).next = map.get(head.next);
            map.get(head).random =map.get(head.random);
            head=head.next;

        }
    return map.get(root);

    }

    public static void main(String args[]){

        Solution s = new Solution();
        Node n1= new Node(1);
        Node n2= new Node(2);
        n1.random=n2;
        n2.random=n2;
        s.copyRandomList(n1);
    }
}
