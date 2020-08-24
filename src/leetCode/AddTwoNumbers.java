package leetCode;



  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int lengthL1 = 0;
        int lengthL2= 0;
        ListNode current = l1;
        while(current!=null){
            lengthL1++;
            current = current.next;
        }
        current = l2;
        while(current!=null){
            lengthL2++;
            current = current.next;
        }
        if(lengthL1>lengthL2){
            return add(l1,l2);
        }else{
            return add(l2,l1);
        }
        
        
    }
    
    public ListNode add(ListNode l1,ListNode l2){
    
        
        ListNode head=null;
        ListNode l3 =null;
        int carry=0;
        int tempSum=0;
        int val2=0;
        while(l1!=null){
            
            if(l2!=null){
                val2=l2.val;
            }else{
                val2=0;
            }
            tempSum = l1.val + val2 + carry;
            if(tempSum>9){
                carry = 1;
                tempSum = tempSum%10;      
            }else{
                carry = 0;
   
            }
            if(head==null){
            	l3 = new ListNode(tempSum);
            	head = l3;
            }else{
            	l3.next = new ListNode(tempSum);
            	l3 = l3.next;
            	}
         
            l1=l1.next;
            l2=l2.next;
        }
        if(carry>0){
        	l3.next = new ListNode(carry);
        }
    
        return head;
    }
    
}
public class AddTwoNumbers {
	
	public static void main(String args[]){
		
		
		ListNode l1 = new ListNode(5);
//		l1.next=new ListNode(4);
//		l1.next.next = new ListNode(3);
//		
		ListNode l2 = new ListNode(5);
//		l2.next=new ListNode(0);
//		l2.next.next = new ListNode(8);
		
		AddTwoNumber s = new AddTwoNumber();
		ListNode l3 = s.addTwoNumbers(l1, l2);
		while(l3!=null){
			System.out.print(l3.val + " ");
			l3 = l3.next;
		}
		
		
	}

}
