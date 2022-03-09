package BST_I;


class LinkedListNode<T> { 
	T data; 
	LinkedListNode<T> next; 
     public LinkedListNode(T data) { 
    	 this.data = data; } 
     }
public class BST_To_Sorted_LL {
		
	//Brute-force
	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		if(root==null){
            return null;
        }
        LinkedListNode<Integer> leftHead=constructLinkedList(root.left);
        
        LinkedListNode<Integer>temp=new LinkedListNode<>(root.data);
        
        LinkedListNode<Integer> rightHead=constructLinkedList(root.right);
        
        if(leftHead!=null){
            LinkedListNode<Integer>curr=leftHead;
            while(curr.next!=null){
                curr=curr.next;
            }
            temp.next=rightHead;
            curr.next=temp;
            return leftHead;
        }else{
            temp.next=rightHead;
            return temp;
        }
	}
}
