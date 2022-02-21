package LinkedList1;

public class Print_ith_Node {
	public static void printIthNode(LinkedListNode<Integer> head, int i){
        if(head==null){
            
        }else{
        while(i>0 && head!=null){
            head=head.next;
            i=i-1;
        }
        if(i>0){
            
        }
        else{
            System.out.println(head.data);
        }
        }
	}
}
