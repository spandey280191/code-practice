package other;
class Solution25 {
    public boolean hasCycle(ListNode head) {
        
    	ListNode slow=head;
    	ListNode fast=head;
    	boolean flag=false;
    	while(fast!=null){
    		
    		
    		slow = slow.next;
    		fast = fast.next;
    		
    		if(fast!=null){
    			fast=fast.next;
    		}
    		
    		if(fast!=null && fast.val == slow.val){
    			
    			flag = true;
    			
    		}
    	}
    	
    	
    	return flag;
    }
}
public class LinkedListCycle {

	public static void main(String[] args) {
		
		Solution25 s = new Solution25();
		ListNode head = new ListNode(1);
		System.out.println(s.hasCycle(head));
		
	}

}
