package BST_I;

public class SearchNodeInBST {
	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if(root==null){
            return false;
        }
        
        if(root.data==k){
            return true;
        }
        boolean ans=false;
        if(k>root.data){
            ans=searchInBST(root.right,k);
        }else{
            ans=searchInBST(root.left,k);
        }
        return ans;
	}
}
