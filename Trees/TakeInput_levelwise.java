package Trees;
import java.util.*;
public class TakeInput_levelwise {
	public static TreeNode<Integer> takeIPLevelWise(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of Root Node");
		int data=sc.nextInt();
		TreeNode<Integer>root=new TreeNode<>(data);
		Queue<TreeNode<Integer>>pendingNodes=new LinkedList<>();
		pendingNodes.add(root);
		
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer>currentNode=pendingNodes.poll();
			System.out.println("Enter Number of Children of "+currentNode.data);
			int childrenCount=sc.nextInt();
			
			for(int i=0;i<childrenCount;i++) {
				System.out.println("Enter "+(i+1)+"th child of "+currentNode.data);
				int value=sc.nextInt();
				TreeNode<Integer>childNode=new TreeNode<>(value);
				currentNode.children.add(childNode);
				pendingNodes.add(childNode);
			}
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
		TreeNode<Integer>root=takeIPLevelWise();
		printTree(root);
		
	}
}
