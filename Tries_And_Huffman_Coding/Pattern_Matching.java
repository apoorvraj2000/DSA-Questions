package Tries_And_Huffman_Coding;

import java.util.ArrayList;

public class Pattern_Matching {
	private TrieNode root= new TrieNode('\0');
	public boolean patternMatching(ArrayList<String> vect, String pattern) {
        for(int i=0;i<vect.size();i++){
            String word=vect.get(i);
            for(int j=0;j<word.length();j++){
                addHelper(root,word.substring(j));
            }
        }
        return patternMatchingHelper(root,pattern);
        
	}
    
    public boolean patternMatchingHelper(TrieNode root, String pattern) {
        if(pattern.length()==0){
            return true;
        }
        int childIndex=pattern.charAt(0)-'a';
		TrieNode child=root.childrens[childIndex];
        
        if(child==null)
            return false;
        
        return patternMatchingHelper(child,pattern.substring(1));
    }
    
    //creating a suffix tries
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
}
