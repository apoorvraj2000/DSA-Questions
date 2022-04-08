package Tries_And_Huffman_Coding;

public class Search_Word_In_Trie {
	TrieNode root = new TrieNode('\0');
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
}
