package LinkedList1;

public class DeleteNodeInLL {
	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
		if(head==null)
            return head;
        if(pos==0){
           head=head.next;
            return head;
        }
        LinkedListNode<Integer> curr=head;
        while(pos>1&&curr!=null){
            curr=curr.next;
            pos--;
        }
        
        if(curr==null||curr.next==null)
            return head;
        LinkedListNode<Integer> temp=curr.next.next;
        curr.next=temp;
        
        return head;
	}
}
