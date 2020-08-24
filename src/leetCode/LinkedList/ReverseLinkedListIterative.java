package leetCode.LinkedList;

public class ReverseLinkedListIterative {

	public ListNode reverseList(ListNode head) {

		ListNode c = head;
		ListNode p = null;
		while (c != null) {
			ListNode n = c.next;
			c.next = p;
			p = c;
			c = n;
		}

		return p;

	}
}
