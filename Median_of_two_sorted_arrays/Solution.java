/*
public class Solution {
	public static void main(String[] args){
		System.out.println("Hello, world.");
	}˜
}
*/

public class Solution {
	public static double findMedianSortedArrays(int[] A, int[] B){
		int m = A.length;
		int n = B.length;
		if (m>n){
			int[] temp = A; A = B; B = temp;
			int tmp = m; m = n; n = tmp;

		}

		int iMin = 0, iMax = m, halflen = (m+n+1)/2;
		while(iMin <= iMin){
			int i = (iMin + iMax)/2;
			int j = halflen - i;
			if (i< iMax && B[j-i]>A[i]){
				iMin = i+1;
			}
			else if(i> iMin && A[i-1]>B[j]){
				iMax = i - 1;
			}
			else{
				int maxLeft = 0;
				if (i == 0){maxLeft = B[j-1];}
				else if(j==0){ maxLeft = A[i-1];}
				else{ maxLeft = Math.max(A[i-1], B[j-1]);}
				if((m+n)%2 == 1){return maxLeft;}

				int minRitht =0;
				if(i == m){ minRitht = B[j];}
				else if(j==n){ minRitht = A[i];}
				else{ minRitht = Math.min(B[j], A[i]);}

				return (maxLeft+minRitht)/2.0;

			}
		
		}
		return 0.0;

	}
	public static void main(String[] args){
		int num1[] = {1,2};
		int num2[] = {3,4};
		
		System.out.println(findMedianSortedArrays(num1, num2));
		
		//System.out.println("Hello, world.");
	}
}