package LinkedList2;

public class Reverse_LL_Iterative {
public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
        
        if(head==null||head.next==null)
            return head;
        
        LinkedListNode<Integer> pre=null;
        LinkedListNode<Integer> curr=head;
        LinkedListNode<Integer> next=null;
        
        while(curr!=null){
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
	}
}
