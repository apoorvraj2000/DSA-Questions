package BST_II;

public class BinarySearchTree {

	  private static BinaryTreeNode<Integer> root;
	    
		public void insert(int data) {
			root=insertHelper(data,root);
		}
	    private BinaryTreeNode<Integer> insertHelper(int data,BinaryTreeNode<Integer>root) {
			//Base case
			if(root==null){
	            BinaryTreeNode<Integer> node=new BinaryTreeNode<>(data);
	            return node;
	        }
	        if(data>root.data){
	            //call Right
	            root.right=insertHelper(data,root.right);
	        }
	        else{
	            //call Left
	            root.left=insertHelper(data,root.left);
	        }
	        return root;
					
		}
		
		public void remove(int data) {
			root=removeHelper(data,root);
		}
	    private BinaryTreeNode<Integer> removeHelper(int data,BinaryTreeNode<Integer>root) {
			//Base case
			if(root==null){
	            return null;
	        }
	        if(root.data==data){
	            if(root.left!=null && root.right==null){
	                return root.left;
	            }
	            else if(root.left==null && root.right!=null){
	                return root.right;
	            }
	            else if(root.left==null && root.right==null){
	                return null;
	            }
	            else{
	                BinaryTreeNode<Integer> minNode = root.right;
	                while (minNode.left != null) {
	                    minNode = minNode.left;
	                }
	                root.data = minNode.data;
	                root.right = removeHelper(minNode.data,root.right);
	                return root;
	            }
	        }
	        
	        if(data>root.data){
	            //Right Call
	            root.right=removeHelper(data,root.right);
	        }
	        if(data<root.data){
	            //Left Call
	            root.left=removeHelper(data,root.left);
	        }
			return root;		
		}
		
		public void printTree() {
			printTreeHelper(root);
		}
	     private void printTreeHelper(BinaryTreeNode<Integer>root){
	         if(root==null)
	             return;
	         
	         //String print=root.data+":";
	         System.out.print(root.data+":");
	         if(root.left!=null){
	             //print+="L:"+root.left.data;
	             System.out.print("L:"+root.left.data+",");
	         }
	         if(root.right!=null){
	             //print+=",R:"+root.right.data;
	             System.out.print("R:"+root.right.data);
	         }
	         System.out.println();
	         printTreeHelper(root.left);
	         printTreeHelper(root.right);
	         return;
	     }
		
		public boolean search(int data) {
			return searchHelper(data,root);
		}
	    private boolean searchHelper(int data,BinaryTreeNode<Integer>root) {
			//Base case1
			if(root==null)
				return false;
			//Base case2
			if(root.data==data) {
				return true;
			}
			else if(data>root.data) {
				//Call on right
				return searchHelper(data, root.right);
			}else {
				//Call on left
				return searchHelper(data, root.left);
			}		
		}
}
