package BinaryTrees;

public class Nodes_without_Sibling {

	public static void printNodesWithoutSibling(TreeNode<Integer> root) {
		if(root==null)
            return;
        
         if(root.right==null && root.left!=null){
            System.out.print(root.left.data+" ");
        }
        
        if(root.left==null && root.right!=null){
            System.out.print(root.right.data+" ");
        }
        
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
   
        
	}
}
