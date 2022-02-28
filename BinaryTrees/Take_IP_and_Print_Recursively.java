package BinaryTrees;
import java.util.*;
public class Take_IP_and_Print_Recursively {
	static Scanner sc=new Scanner(System.in);
	
	public static void print(TreeNode<Integer>root) {
		if(root==null)
			return;
		
		String toPrint=root.data+":";
		if(root.left!=null) {
			toPrint+="L="+root.left.data; 
		}
		if(root.right!=null) {
			toPrint+="R="+root.right.data; 
		}
		System.out.println(toPrint);
		print(root.left);
		print(root.right);
		
	}
	public static TreeNode<Integer> takeIP() {
		int rootData;
		System.out.println("Enter Root Data");
		rootData=sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		TreeNode<Integer>root=new TreeNode<Integer>(rootData);
		root.left=takeIP();
		root.right=takeIP();
		
		return root;
	}
	
	public static void main(String[] args) {
		TreeNode<Integer>root=takeIP();
		print(root);
	}
}
