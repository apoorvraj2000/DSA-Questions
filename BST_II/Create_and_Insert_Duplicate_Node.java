package BST_II;

public class Create_and_Insert_Duplicate_Node {

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if(root==null)
            return;
        
        BinaryTreeNode<Integer> duplicate=new BinaryTreeNode<>(root.data);
        BinaryTreeNode<Integer> temp=root.left;
        root.left=duplicate;
        duplicate.left=temp;
        
        insertDuplicateNode(root.left.left);
        insertDuplicateNode(root.right);
	}
}
