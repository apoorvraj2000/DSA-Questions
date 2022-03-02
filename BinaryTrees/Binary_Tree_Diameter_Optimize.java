package BinaryTrees;

class pair<T,V>{
	T height;
	V diameter;
}
public class Binary_Tree_Diameter_Optimize {

	public pair<Integer,Integer> heightDiameter(TreeNode<Integer>root){
		if(root==null) {
			pair<Integer,Integer>output=new pair<>();
			output.height=0;
			output.diameter=0;
			return output;
		}
		pair<Integer,Integer>leftOutput=heightDiameter(root.left);
		pair<Integer,Integer>rightOutput=heightDiameter(root.right);
		
		int height=1+Math.max(leftOutput.height, rightOutput.height);
		
		int option1=leftOutput.height+rightOutput.height;
		
		int option2=leftOutput.diameter;
		
		int option3=rightOutput.diameter;
		
		int diameter=Math.max(option1, Math.max(option2, option3));
		
		pair<Integer,Integer>output=new pair<>();
		output.height=height;
		output.diameter=diameter;
		
		return output;
	}
	
}
