package Trees;

public class PreOrderTraversal {

	public static void preOrder(TreeNode<Integer>root) {
		if(root==null)
			return;
		
		System.out.print(root.data+" ");
		for(int i=0;i<root.children.size();i++) {
			preOrder(root.children.get(i));
		}
	}
}
