package BinaryTree_II;

public class Construct_Tree_From_Preorder_And_Inorder {

	public static TreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		return result(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
	}
	public static TreeNode<Integer> result(int[] preOrder, int[] inOrder, int preS, int preE, int inS, int inE){
        if(preS>preE || inS>inE)
            return null;
        
        TreeNode<Integer>root=new TreeNode<>(preOrder[preS]);
        
        int rootIndex=-1;
        for(int i=inS;i<=inE;i++){
            if(root.data==inOrder[i]){
                rootIndex=i;
                break;
            }
        }
        int leftInS=inS;
        int leftInE=rootIndex-1;
        int leftPreS=preS+1;
        int leftPreE=leftInE-leftInS+leftPreS;
        
        int rightInS=rootIndex+1;
        int rightInE=inE;
        int rightPreS=leftPreE+1;
        int rightPreE=preE;
        
        TreeNode<Integer>leftPart=result(preOrder,inOrder,leftPreS,leftPreE,leftInS,leftInE);
        
        TreeNode<Integer>rightPart=result(preOrder,inOrder,rightPreS,rightPreE,rightInS,rightInE);
        
        root.left=leftPart;
        root.right=rightPart;
        
        return root;
        
    }
}
