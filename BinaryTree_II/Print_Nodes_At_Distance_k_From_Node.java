package BinaryTree_II;

public class Print_Nodes_At_Distance_k_From_Node {
public static void nodesAtDistanceK(TreeNode<Integer> root, int node, int k) {
	    
        nodesAtDistanceKResult(root,node,k);
	}
    public static int nodesAtDistanceKResult(TreeNode<Integer> root, int node, int k) {
    	 // Base Case 1: If tree is empty, return -1
        if(root==null)
            return -1;
        
         // If target is same as root.  Use the downward function
        // to print all nodes at distance k in subtree rooted with
        // target or root
	    if(root.data==node){
            printNodeAtDepthK(root,k);
            return 0;
        }
	    
	     // Recur for left subtree
        int leftDistance=nodesAtDistanceKResult(root.left, node, k);
        
         // Check if target node was found in left subtree
        if(leftDistance!=-1){
        	// If root is at distance k from target, print root
            // Note that dl is Distance of root's left child from
            // target
            if(leftDistance+1==k){
                 System.out.println(root.data);
            }else{
            	// Else go to right subtree and print all k-dl-2 distant nodes
                // Note that the right child is 2 edges away from left child
                int distance=k-leftDistance-2;
                printNodeAtDepthK(root.right, distance);
            }
            
         // Add 1 to the distance and return value for parent calls
            return leftDistance+1;
        }
        
        // MIRROR OF ABOVE CODE FOR RIGHT SUBTREE
        // Note that we reach here only when node was not found in left
        int rightDistance=nodesAtDistanceKResult(root.right, node, k);
        if(rightDistance!=-1){
            if(rightDistance+1==k){
                 System.out.println(root.data);
            }else{
                int distance=k-rightDistance-2;
                printNodeAtDepthK(root.left, distance);
            }
            return rightDistance+1;
        }
        
     // If target was neither present in left nor in right subtree
        return -1; 
	}
    
    public static void printNodeAtDepthK(TreeNode<Integer> root, int k) {
	    if(root==null || k<0)
            return;
        
        if(k==0){
            System.out.println(root.data);
            return;
        }
        
        printNodeAtDepthK(root.left, k-1);
        printNodeAtDepthK(root.right, k-1);
	}
}
