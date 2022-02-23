package Trees;

public class Check_If_Generic_Tree_Contain_Element_X {

public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
		
        boolean ans=false;
        if(root.data==x){
            ans=true;
            return ans;
        }
		for(int i=0;i<root.children.size();i++){
            ans=checkIfContainsX(root.children.get(i),x);
            if(ans==true)
                break;
        }
        
        return ans;
	}
}
