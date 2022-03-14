package BST_II;

public class Replace_With_Sum_Of_Greater_Nodes {

	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		replace(root,0);
	}
    public static int replace(BinaryTreeNode<Integer> root,int currSum) {
		if(root==null){
            return currSum;
        }
        int rightSum=replace(root.right,currSum);
        
        rightSum+=root.data;
        root.data=rightSum;
        
        int leftSum=replace(root.left,rightSum);
        
        return leftSum;
	}
}
