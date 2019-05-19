/*
Given a set of distinct integers, S, return all possible subsets.
For example,
If S = [1,2,3], a solution is:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.

backtracking algorithm

*/

class Soltuion{
	private List<List<Integer>> listSet = new ArrayList<List<Integer>>();
	private List<Integer> list = new ArrayList<Integer>();

	public List<List<Integer>> subsets(int[] S){
		Array.sort(S);
		addUp(S, 0);
		return listSet;
	}

	private void addUp(int[] S, int start){
		listSet.add(new ArrayList<Integer>(list));
	for(int i = start; i< S.length;i++){
		list.add(S[i]);
		addUp(S, i+1);
		list.remove(list.size()-1);
	}
	}
/*

Subsets II: contains duplicates

Given a collection of integers that might contain duplicates, S, return all possible subsets.
For example,
If S = [1,2,2], a solution is:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
Note:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.



*/
public List<List<Integer>> subsets(int[] S){
	Array.sort(S);
	addUp(S,0);
	return listSet;
}

private void addUp(int[] S, int start){
	listSet.add(new ArrayList<Integer>(list));
	for(int i = start; i< S.length;i++){
		if(i>start&& S[i-1] == S[i]){ continue;}
		list.add(S[i]);
		addUp(S, i+1);
		list.remove(list.size()-1);
	}
}
	
}