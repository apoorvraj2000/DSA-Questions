package BinaryTree_II;

public class LCA_Of_Binary_Tree {

	static int getLCA(TreeNode<Integer> root, int a, int b) {
        if(root==null)
            return -1;
        
        if(root.data==a ||root.data==b){
            return root.data;
        }
        
        int leftAns=getLCA(root.left,a,b);
        
		int rightAns=getLCA(root.right,a,b);
        
        if(leftAns!=-1 && rightAns==-1){
            return leftAns;
        }
        else if(leftAns==-1 && rightAns!=-1){
            return rightAns;
        }
        else if(leftAns!=-1 && rightAns!=-1){
            return root.data;
        }
        
        return -1;
	}
}
