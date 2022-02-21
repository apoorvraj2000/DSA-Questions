package LinkedList1;

public class EliminateDuplicatesFromLL {
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        if(head==null||head.next==null)
            return head;
        LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head.next;
        while(fast!=null){
            if(slow.data.equals(fast.data)){
                fast=fast.next;
            }else{
                slow.next=fast;
                slow=fast;
            }
        }
        slow.next=null;
        return head;
        
	}
}
