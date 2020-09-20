package leetCode.TopInterviewQuestion.Medium.LinkedList.OddEvenLinkedList;

import leetCode.TopInterviewQuestion.Medium.LinkedList.ListNode;

import java.util.List;

public class Solution {

    public ListNode oddEvenList(ListNode head) {

        if(head==null){
            return head;
        }
        ListNode odd = head;
        ListNode startEven = head.next;
        ListNode even = head.next;

        while(odd.next!=null && even.next!=null){

            odd.next =even.next;
            if(odd.next.next!=null){
                even.next = odd.next.next;
                even = even.next;
            }else{
                even.next = null;
            }


            odd = odd.next;


        }

        odd.next = startEven;

        return head;

    }


    public static void main(String[] args) {

    }
}
