/*
Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
Each row must have the numbers 1-9 occuring just once.
Each column must have the numbers 1-9 occuring just once.
And the numbers 1-9 must occur just once in each of the 9 sub-boxes of the grid.

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
there is a better soltuion using string.
Java Set!
Collect the set of things we see, encoded as strings. For example:

'4' in row 7 is encoded as "(4)7".
'4' in column 7 is encoded as "7(4)".
'4' in the top-right block is encoded as "0(4)2".
Scream false if we ever fail to add something because it was already added (i.e., seen before).

Set is a unorder non-duplicated data structure.
Encoding  number and its positon into string.
Then, the string is added in set, thus, no duplicate allowed because of attribute of set.
PS: It can be optimaized.

Write a program that solve the Sudoku.
*/
//The string that represent number indicate that number IN THAT ROW OR COLUMN, that real postion in Sudoku
//does not matter. For example, (4)7 means number 4 is in colum 7 as for which row, that does not matter.
//Same reason for row. 
class Soltuion{
	public boolean isValidSudoku(char[][] board){
		Set seen = new HashSet();
		for(int i = 0;i<9;++i){
			for(int j=0;j<9;++j){
				if(board[i][j]!='.'){
					String b = "(" + board[i][j] + ")";
					//The original order of the number in Sudoku does not matter.
					if(!seen.add(b+i)||!seen.add(j+b)||!seen.add(i/3+b+j/3)) //why i/3+b+j/3 ?
						return false;
				}
			}
		}
		return true;
	}

	public void solveSudoku(char[][] board){
		if(!isValidSudoku(board){
			throw new IllegalArgumentException("Not solvable!");
		}
		
	}

	//DFS
	private boolean isSolvable(char[][] board){
		for(i = 0;i<9;i++){
			for(int j=0;j<9;j++){
				if(board[i][j] == '.'){
					for(int k = 0; k<9; k++){
						board[i][j] = (char)(k + '1');
						if (isValid(i, j, board) && isSolvable(board)) return true;
						board[i][j] = '.';
					}
					return false;
				}
			}
		}
		return true;
	}
	//check vaild.
	private boolean isVaild(int i, int j, char[][] board){
		    // check ith row
    	for (int c = 0; c < 9; c++)
        if (c != j && board[i][c] == board[i][j])   return false;
    // check jth col
    	for (int r = 0; r < 9; r++)
        if (r != i && board[r][j] == board[i][j])   return false;
    // check (i,j)'s subbox
    	for (int k = 0; k < 9; k++) {
        	int row = i / 3 * 3 + k / 3, col = j / 3 * 3 + k % 3;
        	if (row != i && col != j && board[row][col] == board[i][j]) return false;
    }
    return true;
	}










}
