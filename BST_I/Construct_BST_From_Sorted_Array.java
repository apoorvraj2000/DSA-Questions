package BST_I;

public class Construct_BST_From_Sorted_Array {

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		
        return result(arr,0,n-1);
	}
    public static BinaryTreeNode<Integer> result(int[] arr,int si, int ei){
    	if(si>ei){
            return null;
        }
    	int mid=(ei+si)/2;
    
		BinaryTreeNode<Integer>root=new BinaryTreeNode(arr[mid]);
    	root.left=result(arr,si,mid-1);
    	root.right=result(arr,mid+1,ei);
    
        return root;
	}
}
