/*
Given an array of integers, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution.
Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

Idea: Hashtable.
*/

class Solution{
	public int twoSum(int[] numbers, int target){
		HashMap<Intger,Integer> h = new HashMap<Integer, Integer>();
		for(int i = 0;i<numbers.length;i++){
			int key1 = numbers[i];
			int key2 = target - numbers[i];
			if(h.comtainsKey(Key2)){
				return new int[] {h.get(key2)+1, i+1};
			}
			h.put(key1, i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
