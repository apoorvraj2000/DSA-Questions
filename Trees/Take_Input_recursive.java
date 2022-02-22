package Trees;

import java.util.Scanner;

public class Take_Input_recursive {
	
	public static TreeNode<Integer>takeInput(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter next Node data");
		int n=sc.nextInt();
		TreeNode<Integer>root=new TreeNode<Integer>(n);
		System.out.println("Enter number of children for="+n);
		int childrenCount=sc.nextInt();
		for(int i=0;i<childrenCount;i++) {
			TreeNode<Integer>child=takeInput();
			root.children.add(child);
		}
		return root;
	}
	//Print Recursive
	public static void printTree(TreeNode<Integer>root){
		String s=root.data+" :";
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+", ";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			printTree(root.children.get(i));
		}
		
	}
	public static void main(String []args) {
		TreeNode<Integer>root=takeInput();
		printTree(root);
	}
}
