package Trees;

public class StructurallyIdentical {

	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

        if(root1.children.size()!=root2.children.size())
            return false;
        
        for(int i=0;i<root1.children.size();i++){
            if(root1.children.get(i).data!=root2.children.get(i).data){
                return false;
            }
        }
        boolean ans=true;
        for(int i=0;i<root1.children.size();i++){
            ans=checkIdentical(root1.children.get(i),root2.children.get(i));
            
            if(ans==false)
                break;
        }
        return ans;
	}
}
