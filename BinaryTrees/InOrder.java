package BinaryTrees;

public class InOrder {
	public void inorder(TreeNode<Integer>root) {
		if(root==null) {
			return ;
		}
		
		inorder(root.left);
		
		System.out.println(root.data+" ");
		
		inorder(root.right);
	}
}
