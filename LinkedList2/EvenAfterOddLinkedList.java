package LinkedList2;

public class EvenAfterOddLinkedList {

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null)
            return head;
        LinkedListNode<Integer> oddHead=null,oddTail=null,evenHead=null,evenTail=null;
        LinkedListNode<Integer> temp=head;
        
        while(temp!=null){
            if(temp.data%2!=0){
                if(oddHead==null){
                    oddHead=temp;
                    oddTail=temp;
                   
                }else{
                    oddTail.next=temp;
                    oddTail=temp;
                }
                temp=temp.next;
            }else{
                if(evenHead==null){
                    evenHead=temp;
                    evenTail=temp;
                   
                }else{
                    evenTail.next=temp;
                    evenTail=temp;
                }
                temp=temp.next;
            }
        }
        if(oddTail!=null)
            oddTail.next=null;
        if(evenTail!=null)
            evenTail.next=null;
        
        if(oddHead!=null)
        oddTail.next=evenHead;
        else
        oddHead=evenHead;
            
        return oddHead;
	}
}
