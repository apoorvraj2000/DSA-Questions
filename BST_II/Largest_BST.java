package BST_II;

public class Largest_BST {

	
		public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
			if(root==null)
	            return 0;
	    
	    	
	    return helper(root,0);
	      
	    }
		public static int helper(BinaryTreeNode<Integer> root,int maxHeight) {
	    if(root==null){
	        return maxHeight;
	    }
	    
	    if(isBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE)){
	            int currMax=height(root);
	        	maxHeight=Math.max(currMax,maxHeight);
	    }
			 
	    int rightMax=helper(root.right,maxHeight);
	    
	    int leftMax=helper(root.left,maxHeight);
	    
	    return Math.max(rightMax,leftMax);
	    
	   }
	
	
	 public static boolean isBst(BinaryTreeNode<Integer> root, int min, int max) {
	
		if(root==null)
	        return true;
	   
	    if(root.data<min || root.data>max){
	        return false;
	    }
	  
	 
	     boolean ans1=isBst(root.left,min,root.data-1);
	     boolean ans2=isBst(root.right,root.data+1,max);
	    
	    if(ans1==true && ans2==true)
	        return true;
	    
	    return false;
	    
	  }
	public static int height(BinaryTreeNode<Integer> root) {
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
