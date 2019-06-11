/*
Given two binary strings, return their sum (also a binary string).
For example,
a = "11"
b = "1"
Return "100".
Question: What is StringBuilder?
idea:

methods:
StringBuilder
.length()
Math.max
Character.getNumericaVaule
charAt
append
reverse
toString

get number from data structure: Character.getNumericaValue.
one digit + one digit: using loop, also need reference variable to solve carry problem.
initial a new reference variable to store the result.
How to solve decimal to binary?


*/
class Soltuion{
	public String addBinary(String a, String b){
		int place = 2; //Binary
		int na = a.length(), nb = b.length();
		int digit = 0, carry = 0;
		StringBuilder str = new StringBuilder();
		for(int i =0; i< Math.max(na, nb); i++){
			int da = (i<na)? Character.getNumericValue(a.charAt(na-1-i)):0;
			int db = (i<nb)? Character.getNumericValue(b.charAt(nb-1-i)):0;
			int sum = da+db+carry;
			digit = sum%place;
			carry = sum/place;
			str.append(digit);
		}
	if(carry>0){ str.append(carry);}
	return str.reverse().toString();
	}
	public String MyAns(String a, String b){
		int place = 2;
		int na = a.length(), nb = b.length();
		int digit = 0, carry = 0;
		StringBuilder str = new StringBuilder();
		for(int i = 0; i< Math.max(na ,nb);i++){
			int da = (i<na)?Character.getNumericValue(a.charAt(na-1-i)):0;
			int db = (i<nb)?Character.getNumericValue(b.charAt(nb-1-i)):0;
			int sum = da+db+carry;
			digit = sum%place;
			carry = sum/place;
			str.append(digit);
		}
	if(carry>0){
		str.append(carry);}
	return str.reverse().toString();
	}


	
}