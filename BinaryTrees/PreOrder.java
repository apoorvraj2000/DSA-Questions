package BinaryTrees;

public class PreOrder {

	public static void preOrder(TreeNode<Integer> root) {
    	if(root==null){
            return;
        }
        
        System.out.print(root.data+" ");
        
        preOrder(root.left);
        
        preOrder(root.right);
    }
}
