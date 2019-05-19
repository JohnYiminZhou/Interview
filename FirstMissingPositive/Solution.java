/*
Given an unsorted integer array, find the first missing positive integer.
For example,
Given [1,2,0] return 3,
and [3,4,-1,1] return 2.
Note: Your algorithm should run in O(n) time and uses constant space.
Note: You can not directly find min or max in an array, you have to desig it by yourself.

*/
import java.util.Arrays;

class Solution{
	public int firstMissingPositive(int[] A){
		int i = 0;
		while(i <A.length){
			//2 cases to swap
			//A[i] is within [1..N]
			//A[i] and A[A[i]-1] are different
			if(A[i] > 0 && A[i] <= A.length && A[i] != A[A[i]-1]){
				int temp = A[i];
				A[i] = A[temp - 1];
				A[temp - 1] = temp;
			}
			else{
				i++;
			}
		}
	for( i =0 ; i<A.length;i++){
		if(A[i] != i+1) break;

	}
	return i+1;
	}

	
}