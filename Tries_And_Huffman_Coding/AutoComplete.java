package Tries_And_Huffman_Coding;

import java.util.ArrayList;

class TriesNode{
	char data;
	boolean isTerminating;
	TriesNode children[];
	int childCount;

	public TriesNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TriesNode[26];
		childCount = 0;
	}
}
public class AutoComplete {
	public int count;
	
	private TriesNode root = new TriesNode('\0');
	

	private void add(TriesNode root, String word){
		if(word.length() == 0){
			root.isTerminating = true;
			return;
		}		
		int childIndex = word.charAt(0) - 'a';
		TriesNode child = root.children[childIndex];
		if(child == null){
			child = new TriesNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}
	
	// Main autoComplete Code
	public void autoComplete(ArrayList<String> input, String word) {

        for(int i=0;i<input.size();i++){
            add(input.get(i));
        }
		
        TriesNode newRoot=findWord(root,word);
        
        if(newRoot==null || newRoot.childCount==0)
            return;
        
        String outPut="";
        
        printAllWord(newRoot,word,outPut);
    }
    
    public TriesNode findWord(TriesNode root,String word){
        if(word.length()==0)
            return root;
        
        
        int childIndex = word.charAt(0) - 'a';
		TriesNode child = root.children[childIndex];
        if(child==null)
            return null;
        
        return findWord(child,word.substring(1));
    }
    
    public void printAllWord(TriesNode root, String word ,String output) {
        if(root.childCount==0){
            if(output.length()>0)
                System.out.println(word+output);
            return;
        }
        
        if(root.isTerminating == true) {
            System.out.println(word + output);
        }

        for(int i = 0; i < root.children.length; i++) {
            if(root.children[i] != null) {
                String ans = output + root.children[i].data; 
                printAllWord(root.children[i],word,ans);
            }
       }
    }
}
