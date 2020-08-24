package leetCode.LinkedList;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class DeleteNthNode {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		int length = 0;
		ListNode t = head;
		while (t != null) {
			t = t.next;
			length++;
		}

		t = head;
		int remove = length - n;
		int count = 1;
		if (remove == 0) {
			head = t.next;
			return head;
		}
		while (count != remove) {
			t = t.next;
			count++;
		}

		t.next = t.next.next;

		return head;

	}

	public static void main(String args[]) {

		System.out.println("hello");
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		// ListNode n3 = new ListNode(3);
		// ListNode n4 = new ListNode(4);
		// ListNode n5 = new ListNode(5);
		n1.next = n2;
		// n2.next = n3;
		// n3.next = n4;
		// n4.next = n5;
		DeleteNthNode main = new DeleteNthNode();
		main.removeNthFromEnd(n1, 1);

	}

}
