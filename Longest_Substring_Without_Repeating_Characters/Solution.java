import java.util.*;

class Solution{
public static int LSWRC(String s){
	int n = s.length();
	Set<Character> set = new HashSet<Character>();
	int ans = 0, i = 0, j = 0;
	while( i<n && j<n){
		if(!set.contains(s.charAt(j))){
			set.add(s.charAt(j++));
			ans = Math.max(ans, j-1);

		}
	else{
		set.remove(s.charAt(i++));
		}

	}
	return ans;

}
public static void main(String[] args){
	String example = "String";
	System.out.println(LSWRC(example));

}
}

