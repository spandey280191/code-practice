package leetCode.LinkedList;

public class PalindromeLinkedList {
	
	public boolean isPalindrome(ListNode head) {
		
		ListNode reverse = reverseList(head);
		return isEqual(head, reverse);
		
	}
	
	public boolean isEqual(ListNode l1, ListNode l2){
		
		while(l1!=null){
			
			if(l1.val!=l2.val){
				return false;
			}
			l1=l1.next;
            l2=l2.next;
		}
		return true;
	}
	
	public ListNode reverseList(ListNode head) {

		ListNode c = head;
		ListNode p = null;
		while (c != null) {
			ListNode n = new ListNode(c.val);
			n.next = p;
			p = n;
			c = c.next;
		}

		return p;

	}
	
public static void main(String args[]){
		
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(0);
		ListNode n3 = new ListNode(1);
		ListNode n4 = new ListNode(4);
		n1.next = n2;
		 n2.next = n3;
//		 n3.next = n4;
		// n4.next = n5;
		PalindromeLinkedList m = new PalindromeLinkedList();
		 m.isPalindrome(n1);
		
	}

}
