package leetCode.TopInterviewQuestion.RemoveDuplicatesfromSortedListII;

import netscape.security.UserTarget;

import java.util.List;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;

        while(head!=null){

            if(head.next!=null && head.val==head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                prev = head.next;

            }else{
                prev=prev.next;
            }

            head=head.next;
        }

        return dummy.next;

    }

    public static void main(String args[]){

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(4);
        ListNode n7 = new ListNode(5);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        Solution s = new Solution();
        s.deleteDuplicates(n1);
    }
}
