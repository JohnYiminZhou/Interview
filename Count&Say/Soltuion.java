/*
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.
Note: The sequence of integers will be represented as a string.

Idea: Understand the question.
recurisve call...
find the relation !
F1 = 1
F2 = 11
F3 = 1211
...
relation?
Idea: encode number into nature language, then decode into number?
*/

class Soltuion{
	public String(int n){
		if(n<=n) return null;
		StringBuilder str = new StringBuilder("1");
		for(int i =1;i<n;i++){ // find nth number.
			StringBuilder next = new StringBuilder();
			int count = 1;
			for (int j = 1;jk< str.length();j++){ //check current length
				if(str.charAt(j) == str.charAt(j-1)){//check current char is same as last one
					count++;//if it is, increase count.
				}else{
					next.append(count);//otherwise, add it. 
					next.append(str.charAt(j-1));
					count = 1;//reset count cause it is different from last num.
				}
			}
			next.append(count);
			next.append(str.charAt(str.length()-1));
			str = next;
		}
		return str.toString();
	}
	
}