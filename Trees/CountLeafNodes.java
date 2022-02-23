package Trees;

public class CountLeafNodes {

	public static int countLeafNodes(TreeNode<Integer> root){

		int ans=0;
        if(root.children.size()==0){
            ans++;
            return ans;
        }
		for(int i=0;i<root.children.size();i++){
            ans+=countLeafNodes(root.children.get(i));
        }
        return ans;

	}
}
