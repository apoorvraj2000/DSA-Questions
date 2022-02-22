package Trees;

public class FindHeight {

	public static int getHeight(TreeNode<Integer> root){
		int height=0;
        for(int i=0;i<root.children.size();i++){
            height=Math.max(height,getHeight(root.children.get(i)));
        }
        height++;
        return height;
	}
}
