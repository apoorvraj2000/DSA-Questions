package Trees;

public class ReplaceNodeWithDepth {

	public static void replaceWithDepthValue(TreeNode<Integer> root){

		replaceWithDepthValue(root,0);
		
	}
	public static void replaceWithDepthValue(TreeNode<Integer> root,int n){

		if(n==0){
            root.data=0;
        }
		for(int i=0;i<root.children.size();i++){
            root.children.get(i).data=n+1;
        }
        for(int i=0;i<root.children.size();i++){
            replaceWithDepthValue(root.children.get(i),n+1);
        }
	}
}
