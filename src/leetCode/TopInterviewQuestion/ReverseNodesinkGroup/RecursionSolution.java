package leetCode.TopInterviewQuestion.ReverseNodesinkGroup;

public class RecursionSolution {


    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        int length=0,count=0;

        while(curr!=null && length!=k){
            length++;
            curr=curr.next;
        }
        curr=head;

        int i=0;
        if(length==k){
            while(curr!=null && i<k){
                next = curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
                i++;
            }
            head.next = reverseKGroup(curr,k);
        }


        return k==length?prev:curr;

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

        RecursionSolution s = new RecursionSolution();
        ListNode head = s.reverseKGroup(l1,2);


    }
}
