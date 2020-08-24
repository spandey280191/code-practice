package leetCode.LinkedList;

public class MergeSortedLinkList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode head = null;
		ListNode current = null;
		while (l1 != null && l2 != null) {
			ListNode n = new ListNode();
			if (l1.val < l2.val) {
				n.val = l1.val;
				l1 = l1.next;
			} else {
				n.val = l2.val;
				l2 = l2.next;
			}
			if (null == head) {
				current = n;
				head = current;

			} else {
				current.next = n;
				current = current.next;
			}

		}
		while (l1 != null) {
			ListNode n = new ListNode();
			n.val = l1.val;
			l1 = l1.next;
			current.next = n;
			current = current.next;

		}
		while (l2 != null) {
			ListNode n = new ListNode();
			n.val = l2.val;
			l2 = l2.next;
			current.next = n;
			current = current.next;
		}

		return head;
	}
	
	public static void main(String args[]){
		
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode();
		ListNode n4 = new ListNode(4);
		n1.next = n2;
		// n2.next = n3;
//		 n3.next = n4;
		// n4.next = n5;
		 MergeSortedLinkList m = new MergeSortedLinkList();
		 m.mergeTwoLists(n1, n3);
		
	}
}
