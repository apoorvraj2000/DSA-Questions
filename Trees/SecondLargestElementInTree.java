package Trees;

public class SecondLargestElementInTree {

	static TreeNode<Integer>largest=new TreeNode<>(Integer.MIN_VALUE);
    static TreeNode<Integer>secondLargest=null;  
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
        if(root.data>largest.data){
            secondLargest=largest;
            largest=root;
        }
        else if(root.data>secondLargest.data && root.data!=largest.data){
            secondLargest=root;
        }
     
		for(int i=0;i<root.children.size();i++){
            findSecondLargest(root.children.get(i));
        }
        return secondLargest;
	}
}
