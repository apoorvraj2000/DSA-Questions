package BinaryTrees;

public class Count_Number_of_Nodes {

	public int countNodes(TreeNode<Integer>root) {
		if(root==null)
			return 0;
		
		int ans=1;
		ans+=countNodes(root.left);
		ans+=countNodes(root.right);
		
		return ans;
	}
}
