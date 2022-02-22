package Trees;

import java.util.ArrayList;

public class TreeNode<T> {
	public T data;
	ArrayList<TreeNode<T>>children;
	public TreeNode(T value) {
		data=value;
		children=new ArrayList<>();
	}
}
