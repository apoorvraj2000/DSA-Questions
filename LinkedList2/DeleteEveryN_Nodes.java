package LinkedList2;

public class DeleteEveryN_Nodes {

	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int m, int n) {
		if(m==0)
	        return null;
	        
	    if(head==null||n==0)
	            return head;
	        
	       int count1=1;
	       int count2=1;
	         
	        LinkedListNode<Integer> temp1=head;
	        LinkedListNode<Integer> temp2=null;
	        while(temp1!=null){
	            while(count1!=m){
	                if(temp1==null)
	                    break;
	                temp1=temp1.next;
	                count1++; 
	            }
	          if(temp1!=null)
	          temp2=temp1.next;
	          else
	           temp2=temp1;  
	            while(count2!=n){
	                if(temp2==null)
	                    break;
	                temp2=temp2.next;
	                count2++;
	            }
	             if(temp2!=null)
	               temp2=temp2.next;
	            if(temp1!=null)
	            temp1.next=temp2;
	            temp1=temp2;
	            count1=1;
	            count2=1;
	        }
	        return head;
		}
}
