package BinaryTree_II;


import java.util.*;
public class Level_Order_Traversal {

	public static void printLevelWise(TreeNode<Integer> root) {
		Queue<TreeNode<Integer>>pendingNodes=new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);
        System.out.println(root.data);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> front=pendingNodes.poll();
            if(front==null){
                break;
            }
            if(front.left!=null){
                System.out.print(front.left.data+" ");
                pendingNodes.add(front.left);
            }
            if(front.right!=null){
                System.out.print(front.right.data+" ");
                pendingNodes.add(front.right);
            }
            if(pendingNodes.peek()==null) {
            	System.out.println();
            	pendingNodes.poll();
            	pendingNodes.add(null);
            }
        }
	}
}
