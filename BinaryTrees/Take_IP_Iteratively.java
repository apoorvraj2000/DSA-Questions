package BinaryTrees;
import java.util.*;
public class Take_IP_Iteratively {

	public static TreeNode<Integer> takeIp() {
		Scanner sc=new Scanner(System.in);
		Queue<TreeNode<Integer>>pendingNodes=new LinkedList<>();
		int rootData;
		System.out.println("Enter Root Data");
		rootData=sc.nextInt();
		
		if(rootData==-1)
			return null;
		
		TreeNode<Integer>root=new TreeNode<Integer>(rootData);
		pendingNodes.add(root);
		
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer>front=pendingNodes.poll();
			System.out.println("Enter Left Child of:"+front.data);
			int leftChild=sc.nextInt();
			if(leftChild!=-1) {
				TreeNode<Integer>child=new TreeNode<Integer>(leftChild);
				pendingNodes.add(child);
				front.left=child;
			}
			System.out.println("Enter Right Child of:"+front.data);
			int rightChild=sc.nextInt();
			if(rightChild!=-1) {
				TreeNode<Integer>child=new TreeNode<Integer>(rightChild);
				pendingNodes.add(child);
				front.right=child;
			}
		}
		return root;
	}
	
}
