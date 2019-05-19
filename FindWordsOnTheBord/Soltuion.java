/*
Given a 2D board and a list of words from the dictionary, find all words in the board.
Each word must be constructed from letters of sequentially adjacent cell, 
where "adjacent" cells are those horizontally or vertically neighboring. T
he same letter cell may not be used more than once in a word.
For example,
Given words = ["oath","pea","eat","rain"] and board =
[
  ['o','a','a','n'],
  ['e','t','a','e'],
  ['i','h','k','r'],
  ['i','f','l','v']
]
Return ["eat","oath"].
Note:
You may assume that all inputs are consist of lowercase letters a-z.
Hint:
You would need to optimize your backtracking to pass the larger test. Could you stop backtracking earlier?
If the current candidate does not exist in all words' prefix, 
you could stop backtracking immediately. 
What kind of data structure could answer such query efficiently? 
Does a hash table work? Why or why not? How about a Trie? 
If you would like to learn how to implement a basic trie, 
please work on this problem: Implement Trie (Prefix Tree) first.

Idea: Do DFS for each call

Backtracking + Trie
Intuitively, start from every cell and try to build a word in the dictionary. 
Backtracking (dfs) is the powerful way to exhaust every possible ways. 
Apparently, we need to do pruning when current character is not in any word.

How do we instantly know the current character is invalid? HashMap?
How do we instantly know what's the next valid character? LinkedList?
But the next character can be chosen from a list of characters. "Mutil-LinkedList"?
Combing them, Trie is the natural choice. Notice that:

TrieNode is all we need. search and startsWith are useless.
No need to store character at TrieNode. c.next[i] != null is enough.
Never use c1 + c2 + c3. Use StringBuilder.
No need to use O(n^2) extra space visited[m][n].
No need to use StringBuilder. Storing word itself at leaf node is enough.
No need to use HashSet to de-duplicate. Use "one time search" trie.

pls pay attention to trie and DFS.
*/

class Soltuion{


private static final int R = 26; // lowercase letter a to z
private Node root;    

// R-way trie node
private static class Node {
    private String val;
    private Node[] next = new Node[R];
}

// insert key-value pair into trie
private void insert(String key, String val) {
    root = put(root, key, val, 0);
}

private Node put(Node x, String key, String val, int d) {
    Node xCopy = x;
    if (xCopy == null)  xCopy = new Node();
    if (d == key.length()) {
        xCopy.val = val;
        return xCopy;
    }
    int c = key.charAt(d) - 'a';
    xCopy.next[c] = put(xCopy.next[c], key, val, d + 1);
    return xCopy;
}

public List<String> findWords(char[][] board, String[] words) {
    List<String> list = new ArrayList<>();
    int M = board.length;
    if (M == 0) return list;
    int N = board[0].length;
    
    // convert dictionary to a trie
    int dictSize = words.length;
    if (dictSize == 0) return list;
    for (int i = 0; i < dictSize; i++) {
        String word = words[i];
        insert(word, word);
    }
            
    // use DFS to search all valide words
    boolean[][] visited = new boolean[M][N];
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            char letter = board[i][j];
            int c = letter - 'a';
            dfs(board, visited, i, j, root.next[c], list);
        }
    }
    
    // sort the list
    Collections.sort(list);
    return list;
}

// DFS
private void dfs(char[][] board, boolean[][] visited, int i, int j, Node x, List<String> list) {
    if (x == null)  return;
    if (x.val != null && !list.contains(x.val)) {
        list.add(x.val);
    }
    visited[i][j] = true;
    if (i > 0 && !visited[i - 1][j])                    // up
        dfs(board, visited, i - 1, j, x.next[board[i - 1][j] - 'a'], list);
    if (i < board.length - 1 && !visited[i + 1][j])     // down
        dfs(board, visited, i + 1, j, x.next[board[i + 1][j] - 'a'], list);
    if (j > 0 && !visited[i][j - 1])                    // left
        dfs(board, visited, i, j - 1, x.next[board[i][j - 1] - 'a'], list);
    if (j < board[0].length - 1 && !visited[i][j + 1])  // right
        dfs(board, visited, i, j + 1, x.next[board[i][j + 1] - 'a'], list);        
    visited[i][j] = false;
}

}