package leetCode.TopInterviewQuestion.ReverseNodesinkGroup;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode newHead=null;
        ListNode curr=head;
        ListNode prevHead=null;
        int length=0,count=0;

        while(curr!=null){
            length++;
            curr=curr.next;
        }
        count = length/k;
        if(count==0){
            return head;
        }
        curr=head;
        int j=0;
        while(curr!=null && j<count){
            int i=0;
            ListNode currHead=curr;
            ListNode prev=null;
            while (i<k && curr!=null){

                ListNode next = curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;

                i++;
            }
            j++;
            if(newHead==null){
                newHead=prev;
            }
            if(null!=prevHead){
                prevHead.next=prev;
            }
            prevHead=currHead;
        }

        if(curr!=null){
            prevHead.next=curr;
        }

        return newHead;

    }


    public static void main(String args[]){

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;

        Solution s = new Solution();
        s.reverseKGroup(l1,2);


    }
    

}
