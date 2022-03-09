package BST_I;

public class Check_if_a_Binary_Tree_is_BST {

	public static boolean isBST(BinaryTreeNode<Integer> root) {

		if(root==null)
            return true;
       
        return result(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
	}
    public static boolean result(BinaryTreeNode<Integer> root, int min, int max) {

		if(root==null)
            return true;
       
        if(root.data<min || root.data>max){
            return false;
        }
      
     
         boolean ans1=result(root.left,min,root.data-1);
         boolean ans2=result(root.right,root.data+1,max);
        
        if(ans1==true && ans2==true)
            return true;
        
        return false;
        
	}
}
