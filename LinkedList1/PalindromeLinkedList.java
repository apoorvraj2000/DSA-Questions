package LinkedList1;

public class PalindromeLinkedList {
	public static boolean isPalindrome(LinkedListNode<Integer> head) {
        if(head==null || head.next==null)
            return true;
        
        LinkedListNode<Integer> mid=mid(head);
        
        //reverse LL from mid+1
         LinkedListNode<Integer> previous=null;
        LinkedListNode<Integer> current=mid.next;
        LinkedListNode<Integer> next=null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
         LinkedListNode<Integer> curr=head;
        boolean ans=true;
        while(curr!=null&&previous!=null){
            if(!curr.data.equals(previous.data)){
                ans=false;
                break;
            }
            curr=curr.next;
            previous=previous.next;
        }
        return ans;
	}
     
    public static LinkedListNode<Integer> mid(LinkedListNode<Integer> head){
         LinkedListNode<Integer> slow=head;
         LinkedListNode<Integer> fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
