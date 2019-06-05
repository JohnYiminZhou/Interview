/*

There are n coins in a line. 
(Assume n is even). 
Two players take turns to take a coin from one of the ends of the line until 
there are no more coins left. 
The player with the larger amount of money wins.
Would you rather go first or second? Does it matter?
Assume that you go first, 
describe an algorithm to compute the maximum amount of money you can win.


Solution:

Go first can guarantee winning. We can sum up the odd coins and even coins. 
If odd sum is bigger, we always take the odd coin, and vice versus.
Although this guarantees winning, it does not necessarily yields the max amount of money to win. We can take DP to find out the max.
Assume both you and the opponent are taking the coins in an optimal way.
*/

class Solution{
    public int maxMoney(int[] A){
        int N = A.length;
        int[] [] sumA = new int[N][N];
        for(int i = 0;i<N;i++){
            for(int j = 0; j<N;j++){
                sumA[i][j] = ((i==j)?0:sumA[i][j-1]+A[j]);

            }
        }
        int[][] d = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j = 0;j<N-1;j++){
                int r = j, c= i+j;
                d[r][c] = (r == c) ? A[r] : (sumA[r][c] - Math.min(d[r + 1][c], d[r][c - 1]));
            }
        }
        return d[0][N-1];

    }
}