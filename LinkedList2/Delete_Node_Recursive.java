package LinkedList2;

public class Delete_Node_Recursive {
	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	if(head==null)
            return head;
        
        if(pos==0)
            return head.next;
        
        head.next=deleteNodeRec(head.next,pos-1);
        
        return head;
	}
}
