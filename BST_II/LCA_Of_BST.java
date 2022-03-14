package BST_II;

public class LCA_Of_BST {

	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(root==null)
            return -1;
        
        // If both n1 and n2 are smaller than root, then LCA lies in left
        if(root.data>a && root.data>b){
            return getLCA(root.left,a,b);
        }
        // If both n1 and n2 are greater than root, then LCA lies in right
        if(root.data<a && root.data<b){
            return getLCA(root.right,a,b);
        }
        
        return root.data;
	}
}
