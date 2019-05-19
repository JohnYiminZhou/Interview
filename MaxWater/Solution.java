/*
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). 
Find two lines, which together with x-axis forms a container, such that the container contains the most water.
Note: You may not slant the container.
Idea: Using two pointers start and end, record the highest mh
When mh<A[end], start at most store water mh-A[start];
When A[start] > A[end], end at most store water mh-A[end]
*/

class Solution{
	public int trap(int[] A){
		int vol = 0;
		int start = 0, end = A.length - 1;
		int mh = 0;

	while(start < end){
		int min = Math.min(A[start], A[end])；
		if(mh<min){mh = min; }
		if(A[start]<A[end]){ vol += mh - A[start++];}
		else{ vol += mh - A[end--];}
	}
	return vol;
	}
	public static void main(String[] args){
		return 0;
	}

}