package Trees;
import java.util.*;
public class printLevelWise {
	public static void printLevelWise(TreeNode<Integer> root){
		Queue<TreeNode<Integer>>pendingNodes=new LinkedList<>();
        pendingNodes.add(root);
    	System.out.println(root.data);

        while(!pendingNodes.isEmpty()){
            int size=pendingNodes.size();
            while(size!=0){
                TreeNode<Integer> currentNode=pendingNodes.poll();
           
            for(int i=0;i<currentNode.children.size();i++){
                 System.out.print(currentNode.children.get(i).data+" ");
                pendingNodes.add(currentNode.children.get(i));
            	}
                size--;
            }
             System.out.println();
        }

	}
}
