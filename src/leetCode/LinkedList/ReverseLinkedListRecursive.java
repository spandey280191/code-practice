package leetCode.LinkedList;

public class ReverseLinkedListRecursive {

	 public ListNode reverseList(ListNode head) {
	 if (head == null || head.next == null) return head;
	 ListNode p = reverseList(head.next);
	 head.next.next = head;
	 head.next = null;
	 return p;
	 }

	public static void main(String args[]) {

		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		ReverseLinkedListRecursive r = new ReverseLinkedListRecursive();
		r.reverseList(n1);
	}
}
