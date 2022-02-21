package LinkedList1;

public class AppendLastNToFirst {
	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		
        if(head==null||n==0){
           return head;
       }
       int size=size(head);
       int go=size-n;
       
       LinkedListNode<Integer> curr=head;
       
       while(go>1){
           curr=curr.next;
           go--;
       }
       LinkedListNode<Integer> newHead=curr.next;
       curr.next=null;
       LinkedListNode<Integer> curr2=newHead;
       while(curr2.next!=null){
           curr2=curr2.next;
       }
       curr2.next=head;
       
      return newHead;
	}
   public static int size(LinkedListNode<Integer> head){
       int size=0;
       LinkedListNode<Integer> curr=head;
       while(curr!=null){
           curr=curr.next;
           size++;
       }
       return size;
   }
}
