package BinaryTrees;

public class FindNode {

	public static boolean isNodePresent(TreeNode<Integer> root, int x) {
	    if(root==null)
            return false;
        
        if(root.data==x)
            return true;
        
        boolean ans1=isNodePresent(root.left,x);
        boolean ans2=isNodePresent(root.right,x);
        
        if(ans1==true || ans2==true)
            return true;
        
        return false;
	}
}
