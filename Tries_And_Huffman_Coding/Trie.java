package Tries_And_Huffman_Coding;

public class Trie {

	private TrieNode root;
	
	public Trie() {
		root=new TrieNode('\0');
	}
	
	public void add(String word) {
		addHelper(root, word);
	}
	private void addHelper(TrieNode root,String word) {
		if(word.length()==0){
			root.isTearminating=true;
			return;
		}
		int childIndex=word.charAt(0)-'a';
		TrieNode child=root.childrens[childIndex];
		if(child==null) {
			child=new TrieNode(word.charAt(0));
			root.childrens[childIndex]=child;
		}
		addHelper(child, word.substring(1));
	}
	
	public boolean search(String word){
		return searchHelper(root,word);
	}
	
	private boolean searchHelper(TrieNode root, String word){
        if(word.length()==0){
            if(root.isTearminating==true)
                return true;
            else
                return false;
        }
        int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.childrens[childIndex];
        if(child==null){
            return false;
        }
        return searchHelper(child,word.substring(1));
    }
	
	public void remove(String word) {
		removeHelper(root, word);
	}
	
	private void removeHelper(TrieNode root, String word){
        if(word.length()==0){
            root.isTearminating=false;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.childrens[childIndex];
        if(child==null){
            return ;
        }
        removeHelper(child, word.substring(1));
        //We can remove the node only if it is non terminating and its number of children are 0
        if(!child.isTearminating) {
        	int noOfChild=0;
        	for(int i=0;i<26;i++) {
        		if(child.childrens[i]!=null) {
        			noOfChild++;
        		}
        	}
        	if(noOfChild==0) {
        		//We can now delete the node
        		root.childrens[childIndex]=null;
        		child=null;
        	}
        }
    }
}
