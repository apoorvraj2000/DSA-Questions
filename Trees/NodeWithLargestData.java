package Trees;

public class NodeWithLargestData {
	public int largestNode(TreeNode<Integer> root){
		int ans=root.data;
		for(int i=0;i<root.children.size();i++) {
			int childLargest=largestNode(root.children.get(i));
			if(childLargest>ans)
				ans=childLargest;
		}
		return ans;
	}
}
