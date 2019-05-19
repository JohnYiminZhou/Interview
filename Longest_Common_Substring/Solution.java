/*

Given two string sequences write an algorithm to find,
find the length of longest substring present in both of them.

idea: Build a matrix, row for string X, voclum for Y. if any char in matrix matched,
set value 1 for it. Also, we accumulate the value if pre chars are match, say
L[i][j] = L[i-1][j-1]+1.
Explain:
If current chars are matched, we set value 1 to it and move on 1 char for each side, thus i+1, j+1.

*/

public class Solution{
	public static int find(char[] A, char [] B){
		int [][]LCS = new int [A.length+1][B.length+1];
		for(int i = 0; i< B.length;i++){
			LCS[0][i]
		}

		for(int i = 0；j<A.length;j++){
			LCS[j][0];
		}

		for(int i=1;i<=A.length;i++){
			for(int j=1;j<=B.length;j++){
				if(A[i-1]==B[j-1]){
					LCS[i][j] =  LCS[i-1][j-1] +1;
				}else{
					LCS[i][j] = 0;					
				}
			}
		}	
		int result = -1;
		for(int i=0;i<=A.length;i++){
			for(int j=0;j<=B.length;j++){
				if(result<LCS[i][j]){
					result = LCS[i][j];
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		String A = "tutorialhorizon";
		String B = "dynamictutorialProgramming";		
		System.out.println("LCS length : " + find(A.toCharArray(), B.toCharArray()));
	}

}