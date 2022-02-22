package Trees;

public class sumOfAllNode {

	public static int sumOfAllNode(TreeNode<Integer> root){
		int sum=root.data;
        for(int i=0;i<root.children.size();i++){
            sum+=sumOfAllNode(root.children.get(i));
        }
        return sum;
	}
}
