package leetCode.TopInterviewQuestion.Medium.LinkedList.AddTwoNumbers;

import leetCode.TopInterviewQuestion.Medium.LinkedList.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {


    // Leet Code Solution
    public ListNode addTwoNumbersLeetCodeSolution(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry=0;
        ListNode result = null;
        ListNode head = null;
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        while(l1!=null && l2!=null){
            int sum = l1.val + l2.val + carry;
            carry  = sum/10;
            ListNode node = new ListNode(sum%10);
            if(null!=result){
                result.next = node;
                result=result.next;
            }else{
                result = node;
                head = node;
            }

            l1=l1.next;
            l2=l2.next;
        }

        while(l1!=null){
            int sum = l1.val + carry;
            carry  = sum/10;
            ListNode node = new ListNode(sum%10);
            result.next = node;
            result=result.next;
            l1=l1.next;
        }

        while(l2!=null){
            int sum = l2.val  + carry;
            carry  = sum/10;
            ListNode node = new ListNode(sum%10);
            result.next = node;
            result=result.next;
            l2=l2.next;
        }

        if(carry>0){
            ListNode node = new ListNode(carry);
            result.next = node;
        }

        return head;
    }
}