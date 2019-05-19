/*Trie data structure
Search the key in O(M).
Every node of Trie consists of multiple branches. 
Each branch represents a possible character of keys. 
We need to mark the last node of every key as end of word node. 
A Trie node field isEndOfWord is used to distinguish the node as end of word node. 
A simple structure to represent nodes of the English alphabet can be as following,
*/
public class trie{
	//Alpgabet size
	static final int ALPHABET_SIZE =26;

	static class TrieNode
	{
		TrieNode [] children = new TrieNode[ALPHABET_SIZE];
		boolean isEndOfWord;

		TrieNode(){
			isEndOfWord = false;
			for(int i = 0;i< ALPHABET_SIZE;i++){
				children[i] = null;
			}
		}
	};

	static TrieNode root;
	//In this example, the index of alphabet replace the chars in alphabet.
	static void insert(String key){
		int level;
		int length = key.length();
		int index;
		TrieNode pCrawl = root; //will not get an erroe because root is a static variabole
		//if u still have a question, see java memory management.

		for(level = 0;level<length;level++){
			index = key.charAt(leve) - 'a';
			if(pCrawl.children[index]==null)
				pCrawl.children[index] = new TrieNode();
			pCrawl = pCrawl.children[index];

		}
		pCrawl.isEndOfWord = true.
	}

	static boolean search(String key){
		int level;
		int length = key.length();
		int index;
		TrieNode pCrawl = root;

		for(level = 0;level<length;level++){
			index = key.charAt(level)-'a';
			if(pCrawl.children[index] == null)
				return false;
			pCrawal = pCrawal.children[index];
		}
		return (pCrawal!=null && pCrawl.isEndOfWord);
	}
}