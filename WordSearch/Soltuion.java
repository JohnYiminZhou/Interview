/*

I. Check if board contains a word

Given a 2D board and a word, find if the word exists in the grid.
The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
For example,
Given board =
[
  ["ABCE"],
  ["SFCS"],
  ["ADEE"]
]
word = "ABCCED", -> returns true,
word = "SEE", -> returns true,
word = "ABCB", -> returns false.

keyword: DFS.





*/

class Soltuion{
	public boolean exist(char[][] board, String word){
		int m = board.length; // horizontal
		int n = board[0].length; // vertical
		boolean[][] visited = new boolean[m][n]; // build a new board.
		for(int i = 0; i<m; i++){ // search in every cell.
			for(int j = 0; j<n; j++){
				if(dfs(board, visited, i, j, 0, word)){
					return true;
				}
			}
		}
		return false;
	}

	private boolen dfs(char[][] board, boolean[][] visited, int i int j){
		if(index == word.length()){ return true;} // if the length enough.
		if(i<0 || i >= board.length || j <0 || j>= board[0].length){ // if the search cross the board, then
		// it must be false.
			return false;
		}
		if(visited[i][j]){ return false;}// stop if visisted.
		if(board[i][j]!= word.charAt(index)){
			return false;
		}
		visited[i][j] = true; // marked as visited.
		//The core of the program.
		boolean match = dfs(board, visited, i - 1, j, index + 1, word)
                 || dfs(board, visited, i, j - 1, index + 1, word)
                 || dfs(board, visited, i + 1, j, index + 1, word)
                 || dfs(board, visited, i, j + 1, index + 1, word);
        //Otherwise, it will be false.
    	visited[i][j] = false;
		return match;
	}
}