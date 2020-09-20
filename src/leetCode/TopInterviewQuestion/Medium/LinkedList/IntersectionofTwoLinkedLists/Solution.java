package leetCode.TopInterviewQuestion.Medium.LinkedList.IntersectionofTwoLinkedLists;

import leetCode.TopInterviewQuestion.Medium.LinkedList.ListNode;

public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int length1 = 0;
        int length2 =0;
        ListNode first = headA;
        ListNode second = headB;
        while(first!=null){
            length1++;
            first = first.next;
        }

        while(second!=null){
            length2++;
            second = second.next;
        }

         first = headA;
         second = headB;

        if(length1>length2){
            int diff = length1 - length2;

            while (diff > 0) {

                first = first.next;
                diff--;

            }


        }else{
            int diff = length2 - length1;

            while (diff > 0) {

                second = second.next;
                diff--;

            }
        }

        while(first!=null){

            if(first == second){
                return first;
            }

            first = first.next;
            second = second.next;

        }

        return null;

    }

}
