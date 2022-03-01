package BinaryTrees;

public class Mirror_Binary_Tree {

	public static void mirrorBinaryTree(TreeNode<Integer> root){
		mirror(root);
	}
    public static TreeNode<Integer> mirror(TreeNode<Integer> root){
		if(root==null)
            return root;
        
        TreeNode<Integer> left=mirror(root.left);
        
        TreeNode<Integer> right=mirror(root.right);
        
        //swap
        root.left=right;
        root.right=left;
            
        
        return root;
	}
}
