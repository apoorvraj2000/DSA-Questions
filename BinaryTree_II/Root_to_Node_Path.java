package BinaryTree_II;

import java.util.ArrayList;

public class Root_to_Node_Path {

	public static ArrayList<Integer> getPath(TreeNode<Integer> root, int data){
		if(root==null){
            return null;
        }
        if(root.data==data){
            ArrayList<Integer>arr=new ArrayList<>();
            arr.add(root.data);
            return arr;
        }
        
        ArrayList<Integer>leftSmallAns=getPath(root.left,data);
        
        if(leftSmallAns!=null){
            leftSmallAns.add(root.data);
            return leftSmallAns;
        }
        
        ArrayList<Integer>rightSmallAns=getPath(root.right,data);
        if(rightSmallAns!=null){
            rightSmallAns.add(root.data);
            return rightSmallAns;
        }else{
            return null;
          }    
          
        }
}
