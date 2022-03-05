package BinaryTree_II;

public class Construct_Tree_From_Postorder_and_Inorder {

	public static TreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		return buildTreeResult(postOrder,inOrder,0,postOrder.length-1,0,inOrder.length-1);
	}
    
    public static TreeNode<Integer> buildTreeResult(int[] postOrder, int[] inOrder, int poS, int poE, int inS, int inE) {
        if(poS>poE || inS>inE)
            return null;
        
        TreeNode<Integer> root=new TreeNode<>(postOrder[poE]);
        int rootIndexFromInOrder=-1;
        for(int i=0;i<=inE;i++){
            if(root.data==inOrder[i]){
                rootIndexFromInOrder=i;
                break;
            }
        }
		
        int leftInS=inS;
        int leftInE=rootIndexFromInOrder-1;
        int rightInS=rootIndexFromInOrder+1;
        int rightInE=inE;
        
        int leftPoS=poS;
        int rightPoE=poE-1;
        int leftPoE=poS-inS+rootIndexFromInOrder-1;
        int rightPoS=poE-inE+rootIndexFromInOrder;
        
        TreeNode<Integer> leftPart=buildTreeResult(postOrder,inOrder,leftPoS,leftPoE,leftInS,leftInE);
            
        TreeNode<Integer> rightPart=buildTreeResult(postOrder,inOrder,rightPoS,rightPoE,rightInS,rightInE);
        
        root.left=leftPart;
        root.right=rightPart;
        
        return root;
	}
}
