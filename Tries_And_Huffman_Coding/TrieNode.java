package Tries_And_Huffman_Coding;

public class TrieNode {
	char data;
	boolean isTearminating;
	TrieNode[]childrens;
	public TrieNode(char data) {
		this.data = data;
		isTearminating = false;
		childrens = new TrieNode[26];
	}
	
}
