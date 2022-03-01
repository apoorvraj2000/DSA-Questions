package BinaryTrees;

public class Height_Of_Binary_Tree {

	public static int height(TreeNode<Integer> root) {
		if(root==null)
            return 0;
        
         int ans=1;
        
        //find left Height
        int leftheight=height(root.left);
        //find right Height
        int rightheight=height(root.right);
        //Find max value and add in ans
        ans+=Math.max(leftheight,rightheight);
        
        return ans;
	}
}
