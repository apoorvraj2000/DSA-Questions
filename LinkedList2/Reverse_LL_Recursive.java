package LinkedList2;

public class Reverse_LL_Recursive {
	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		if(head==null)
            return head;
        if(head.next==null)
            return head;
        LinkedListNode<Integer> newHead=reverseLinkedListRec(head.next);
        
        LinkedListNode<Integer> temp=newHead;
        while(temp.next!=null){
            temp=temp.next;
        }
        head.next=null;
        temp.next=head;
        
        return newHead;
	}
}
