package LinkedList2;

public class kReverse {

	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        if(k==0||head==null)
            return head;
        
        int count=1;
        LinkedListNode<Integer> currHead=head;
        LinkedListNode<Integer> currTail=head;
        while(count!=k && currTail.next!=null){
            currTail=currTail.next;
            count++;
        }
        LinkedListNode<Integer> newHead=currTail.next;
        currTail.next=null;
        
        LinkedListNode<Integer> remainingHead=kReverse(newHead,k);
        
         LinkedListNode<Integer> reverseHead=reverse(currHead);
        
         LinkedListNode<Integer> temp=reverseHead;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=remainingHead;
        return reverseHead;
        
	}
   public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head) {
        if(head==null)
            return head;
       
        LinkedListNode<Integer> pre=null;
        LinkedListNode<Integer> curr=head;
        LinkedListNode<Integer> next=null;
        boolean equal=false;
        while(curr!=null){      
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
	}
}
