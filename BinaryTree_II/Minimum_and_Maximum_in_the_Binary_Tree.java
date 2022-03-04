package BinaryTree_II;

class Pair<T, U> {
	T minimum;
	U maximum;

	public Pair(T minimum, U maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

}
public class Minimum_and_Maximum_in_the_Binary_Tree {

	public static Pair<Integer, Integer> getMinAndMax(TreeNode<Integer> root) {
		if(root==null){
            Pair<Integer, Integer> temp=new Pair<>(Integer.MAX_VALUE,Integer.MIN_VALUE);
            return temp;
        }
        
        Pair<Integer, Integer> currentMaxMin=new Pair<>(root.data,root.data);
        
        Pair<Integer, Integer> leftMaxMin=getMinAndMax(root.left);
        
        Pair<Integer, Integer> rightMaxMin=getMinAndMax(root.right);
        
        int min=Math.min(leftMaxMin.minimum,rightMaxMin.minimum);
        currentMaxMin.minimum=Math.min(currentMaxMin.minimum,min);
        
        int max=Math.max(leftMaxMin.maximum,rightMaxMin.maximum);
        currentMaxMin.maximum=Math.max(currentMaxMin.maximum,max);
        
        return currentMaxMin;
	}
}
