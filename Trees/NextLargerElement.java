package Trees;

public class NextLargerElement {

	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
        TreeNode<Integer> ans=null;
        if(root.data>n)
            ans=root;
        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> smallAns=findNextLargerNode(root.children.get(i),n);
            if(ans==null){
                ans=smallAns;
            }
            else if(smallAns!=null && smallAns.data<ans.data){
                ans=smallAns;
            }
        }
        return ans;
	}
}
