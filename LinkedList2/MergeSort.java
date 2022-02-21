package LinkedList2;

public class MergeSort {
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        if(head==null || head.next==null)
            return head;
		LinkedListNode<Integer> mid=midNode(head);
        LinkedListNode<Integer> part1Head=head;
        LinkedListNode<Integer> part2Head=mid.next;
        //Break LL in two parts
        while(head!=mid){
            head=head.next;
        }
         head.next=null;
         LinkedListNode<Integer> head1=mergeSort(part1Head);
         LinkedListNode<Integer> head2=mergeSort(part2Head);
        return mergeTwoSortedLinkedLists(head1,head2);
	}
	public static LinkedListNode<Integer> midNode(LinkedListNode<Integer> head) {
		if(head==null)
            return head;
       LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
	}
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
        LinkedListNode<Integer> newHead=null;
        LinkedListNode<Integer> newTail=null;
        if(head1.data<=head2.data){
            newHead=head1;
            newTail=head1;
            head1=head1.next;
        }else{
            newHead=head2;
            newTail=head2;
            head2=head2.next; 
        }
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                newTail.next=head1;
                newTail=head1;
                head1=head1.next;
                
            }else{
                newTail.next=head2;
                newTail=head2;
                head2=head2.next;
            }
        }
        if(head1==null){
            newTail.next=head2;
        }
        if(head2==null){
            newTail.next=head1;
        }
        return newHead;
    }
}
