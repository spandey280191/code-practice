package leetCode.MonthlyChallenge.Jan2021.MergeTwoSortedLists;

import java.util.List;

class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummy=new ListNode(0,null);
        ListNode curr=dummy;
        while(l1!=null && l2!=null){

            if(l1.val<l2.val){
                ListNode l = new ListNode(l1.val);
                curr.next=l;
                l1=l1.next;
            }else{
                ListNode l = new ListNode(l2.val);
                curr.next=l;
                l2=l2.next;
            }
            curr=curr.next;

        }

        while(l1!=null){
            ListNode l = new ListNode(l1.val);
            curr.next=l;
            l1=l1.next;
            curr=curr.next;
        }

        while (l2!=null){
            ListNode l = new ListNode(l2.val);
            curr.next=l;
            l2=l2.next;
            curr=curr.next;
        }


        return dummy.next;

    }
}