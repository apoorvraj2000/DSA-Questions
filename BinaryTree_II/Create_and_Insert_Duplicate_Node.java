package BinaryTree_II;

public class Create_and_Insert_Duplicate_Node {

	public static void insertDuplicateNode(TreeNode<Integer> root) {
		if(root==null)
            return;
        
        TreeNode<Integer>toAdd=new TreeNode<>(root.data);
        TreeNode<Integer>leftPart=root.left;
        root.left=toAdd;
        toAdd.left=leftPart;
        
        insertDuplicateNode(root.left.left);
        insertDuplicateNode(root.right);
            
	}
}
