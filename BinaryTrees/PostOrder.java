package BinaryTrees;

public class PostOrder {

	public static void postOrder(TreeNode<Integer> root) {
		if(root==null){
            return;
        }
        
        postOrder(root.left);
        
        postOrder(root.right);
        
        System.out.print(root.data+" ");
	}
}
