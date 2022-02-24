package Trees;

public class Node_Having_Sum_of_Children_and_Node_is_Max {

	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        if(root==null)
            return null;
        
		TreeNode<Integer>ans=root;
        
        int maxSum=sumOfChildren(root);
        
        
        for(int i=0;i<root.children.size();i++){
 			TreeNode<Integer> smallAns=maxSumNode(root.children.get(i));
            int currSum=sumOfChildren(smallAns);
        	if(currSum>maxSum){
                maxSum=currSum;
            	ans=smallAns;
        	}
        }
        return ans;
	}
	public static int sumOfChildren(TreeNode<Integer> root){
        int sum=root.data;
        for(int i=0;i<root.children.size();i++){
            sum+=root.children.get(i).data;
        }
        return sum;
	}
}
