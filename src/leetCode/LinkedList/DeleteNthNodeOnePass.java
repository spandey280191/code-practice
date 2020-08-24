package leetCode.LinkedList;

public class DeleteNthNodeOnePass {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		
		ListNode c = head;
		ListNode p = head;
		while(n>0 && c!=null){
			c=c.next;
			n--;
		}
		if(c==null){
			return p.next;
		}
		while(c.next!=null){
			c = c.next;
			p=p.next;
		}
		p.next = p.next.next;
		
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
		DeleteNthNodeOnePass main = new DeleteNthNodeOnePass();
		main.removeNthFromEnd(n1, 1);

	}

}
