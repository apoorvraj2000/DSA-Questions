package LinkedList1;

public class LengthOfLL {
	
	public static int length(LinkedListNode<Integer> head){
		int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
	}
}
