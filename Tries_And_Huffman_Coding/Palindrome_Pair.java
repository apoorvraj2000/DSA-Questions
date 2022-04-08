package Tries_And_Huffman_Coding;

import java.util.ArrayList;

public class Palindrome_Pair {
	private TrieNode root= new TrieNode('\0');
	private void add(TrieNode root, String word){
		if(word.length() == 0){
			root.isTearminating = true;
			return;
		}		

		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.childrens[childIndex];

		if(child == null) {
			child = new TrieNode(word.charAt(0));
			root.childrens[childIndex] = child;
		
		}

		add(child, word.substring(1));
	}

	public void add(String word){
		add(root, word);
	}

	private boolean search(TrieNode root, String word) {
		if(word.length() == 0) {
			return root.isTearminating;
		}

		int childIndex=word.charAt(0) - 'a';
		TrieNode child=root.childrens[childIndex];

		if(child == null) {
			return false;
		}

		return search(child,word.substring(1));

	}

	public boolean search(String word) {
		return search(root,word);
	}
	
	/*..................... Palindrome Pair................... */


	public boolean isPalindromePair(ArrayList<String> words) {
			ArrayList<String> reverseWords=new ArrayList<>();
        for(int i=0;i<words.size();i++)
        {
        	add(words.get(i));
        	for(int j=0;j<words.get(i).length();j++) {
        		add(words.get(i).substring(j));
        	}
            for(int j=words.get(i).length();j>0;j--) {
        		add(words.get(i).substring(0,j));
        	}
        }
        for(int i=0;i<words.size();i++)
        {
            String s=words.get(i);
            reverseWords.add(reverse(s));
        }
        for(int i=0;i<reverseWords.size();i++)
        {
            boolean flag=search(reverseWords.get(i));
                if(flag)
                return true;
        }
        return false;
    }

	public String reverse(String s){
        String ans="";
        
        for(int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }
        
        return ans;
    }

}
