package BinaryTrees;

public class Binary_Tree_Diameter {
	//TC= O(n*h)
	public int diameter(TreeNode<Integer>root) {
		if(root==null) {
			return 0;
		}
		int option1=height(root.left)+height(root.right);
		int option2=diameter(root.left);
		int option3=diameter(root.right);
		
		return Math.max(option1, Math.max(option2, option3));
	}

	//TC= O(n)
	int height(TreeNode<Integer> root) {
		if(root==null)
			return 0;
		
		int ans=1;
		
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		
		ans+=Math.max(leftHeight, leftHeight);
		
		return ans;
	}
	
}
