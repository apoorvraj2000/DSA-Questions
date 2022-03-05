package BinaryTree_II;

public class Path_Sum_Root_to_Leaf {

   public static void rootToLeafPathsSumToK(TreeNode<Integer> root, int k) {
		
        rootToLeafPathsSumToKAns(root,k,"");
	}
	public static void rootToLeafPathsSumToKAns(TreeNode<Integer> root, int k, String opSoFar) {
         if(root==null)
            return;
        if(root.left==null && root.right==null && root.data==k){
            System.out.println(opSoFar+root.data);
            return;
        }
        opSoFar+=root.data+" ";
        rootToLeafPathsSumToKAns(root.left,k-root.data,opSoFar);
        
        rootToLeafPathsSumToKAns(root.right,k-root.data,opSoFar);
	}
}
