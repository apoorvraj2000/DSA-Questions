package BST_II;

import java.util.ArrayList;

public class Find_Path_In_BST {
	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		if(root==null){
            return null;
        }
        if(root.data==data){
            ArrayList<Integer>arr=new ArrayList<>();
            arr.add(root.data);
            return arr;
        }
        
        if(data<root.data){
            ArrayList<Integer>leftSmallAns=getPath(root.left,data);
            if(leftSmallAns!=null){
            leftSmallAns.add(root.data);
            return leftSmallAns;
           }
        }
        
        if(data>root.data){
            ArrayList<Integer>rightSmallAns=getPath(root.right,data);
             if(rightSmallAns!=null){
            rightSmallAns.add(root.data);
            return rightSmallAns;
           }
        }
        
          return null;
           
        }
}
