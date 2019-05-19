/*
Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
For example,
S = "ADOBECODEBANC"
T = "ABC"
Minimum window is "BANC".
Idea: HashTable.
Slide Window again,

Anlysis:
In window, order does not matters.
Rethink about hashtable, why is useful in this question.0.

Notes:
A public class has "public" visibility, which means that it is accessible to any class 
in any package, while a class has "default" or "package" visibility, 
i.e. the class is accessible only to classes inside the same package. 

Idea: 
*/

public class Soltuion{
public String minWindow(String s, String t){
	if(s == null || s.length()< t.length() || s.length() == 0){
		return "";
	//Build a hashtable to store chars for t, each char in t has hash value that represent its total count in t.\
	//The reason for that is in this question, order does not matters.
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	for(char c : t.toCharArray()){// Can for loop do this?
		if(map.containKey(c)){
			map.put(c,map.get(c)+1);
		}
		else{
			map.put(c,1);
		}
	}
	}
	int left = 0; //pointer that scan the s.
	int minleft = s.length()+1; // Asume the min length is s itself.
	int count = 0;//count the char num for hashtable in window.
	for(int right = 0; right<s.length(); right++){
		if(map.containKey(s.charAt(right))){
			//if all the chars are found then the value in map should be less than or equall 0.
			//equall means the occurences of that char are found in that window.
			//less than 0 means the specific char are found and it is duplicated.
			map.put(s.charAt(ritht),map.get(s.charAt(right))-1);
		}
		//if chars hash value is more than 0 which means the window still need increase because 
		//all the chars are not found in s.
		//if one char in s is same as in t, increse count.
		if(map.get(s.charAt(right))>=0){
			count++;
		}
		// in current window.
		while(count == t.length()){
			if(right - left+1<minLen){
				minLetf = left;
				minLen = right-left +1;// find the min size of window.
			}
			//Now, we move window.
			if(map.containsKey(s.chartAt(left))){
				//if window left side is in t, then we move forward.
				//In this situationn, left is not in window, therefore, we +1 for
				//it and try to search it in new window.
				//We slide window by move scaner +1, thus, count lose 1 point.
				map.put(s.charAt(left), map.get(s.charAt(left))+1);
				if(map.get(s.charAt(left))>0){
					count--;
				}

			}
            left++;
		}
	}
	if(minLen>s.length()){
		return "";
	}


  }

}