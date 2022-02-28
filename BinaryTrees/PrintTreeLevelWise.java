package BinaryTrees;
import java.util.*;
public class PrintTreeLevelWise {

	public static void printLevelWise(TreeNode<Integer> root) {
		Queue<TreeNode<Integer>>pendingNodes=new LinkedList<>();
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer>front=pendingNodes.poll();
            String toPrint=front.data+":";
            if(front.left!=null){
                toPrint+="L:"+front.left.data+",";
                pendingNodes.add(front.left);
            }else{
                toPrint+="L:-1,";
            }
            
            if(front.right!=null){
                toPrint+="R:"+front.right.data;
                pendingNodes.add(front.right);
            }else{
                toPrint+="R:-1";
            }
            System.out.println(toPrint);
        }
	}
}
