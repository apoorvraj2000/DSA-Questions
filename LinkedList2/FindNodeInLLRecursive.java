package LinkedList2;

public class FindNodeInLLRecursive {

	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	//Your code goes here
        return findNodeRec(head,n,0);
	}
	public static int findNodeRec(LinkedListNode<Integer> head, int n, int pos) {
    	//Your code goes here
        if(head==null)
            return -1;
        if(head.data==n)
            return pos;
        int ans=findNodeRec(head.next,n,pos+1);
        
        return ans;
	}
}
