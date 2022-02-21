package LinkedList1;

public class PrintReverseLinkedList {
	public static void printReverse(LinkedListNode<Integer> head) {
        if(head==null){
            return;
        }
        
        printReverse(head.next);
        System.out.print(head.data+" ");
	}
}
