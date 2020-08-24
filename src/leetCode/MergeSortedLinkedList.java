package leetCode;
/**

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution6 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = null;
		ListNode l3 = new ListNode(0);
		head = l3;

		while (l1 != null && l2 != null) {

			if (l1.val < l2.val) {
				l3.val = l1.val;
				l1 = l1.next;
			} else {
				l3.val = l2.val;
				l2 = l2.next;
			}

			if (l1 != null || l2 != null) {
				l3.next = new ListNode(0);
				l3 = l3.next;
			}

		}

		while (l1 != null) {
			l3.val = l1.val;
			l1 = l1.next;
			if (l1 != null) {
				l3.next = new ListNode(0);
				l3 = l3.next;
			}
		}

		while (l2 != null) {
			l3.val = l2.val;
			l2 = l2.next;
			if (l2 != null) {
				l3.next = new ListNode(0);
				l3 = l3.next;
			}

		}

		return head;
	}
}

public class MergeSortedLinkedList {

	public static void main(String args[]) {

		Solution6 s = new Solution6();
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		ListNode l3 = s.mergeTwoLists(l1, l2);
		while(l3!=null){
			System.out.println(l3.val);
			l3=l3.next;
		}
	}
}
