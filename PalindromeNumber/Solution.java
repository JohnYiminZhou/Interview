// Determine whether an integer is a palindrome. Do this without extra space.
//Idea: palindrome number read from backford as same as itself.
//Question: how to reverse an integer?
/*
Modding (%) the input int by 10 will extract off the rightmost digit. example: (1234 % 10) = 4

Multiplying an integer by 10 will "push it left" exposing a zero to the right of that number, example: (5 * 10) = 50

Dividing an integer by 10 will remove the rightmost digit. (75 / 10) = 7

Java reverse an int value - Pseudocode:

a. Extract off the rightmost digit of your input number. (1234 % 10) = 4

b. Take that digit (4) and add it into a new reversedNum.

c. Multiply reversedNum by 10 (4 * 10) = 40, this exposes a zero to the right of your (4).

d. Divide the input by 10, (removing the rightmost digit). (1234 / 10) = 123

e. Repeat at step a with 123


*/
class Solution{
	public boolen isPalindrome(int x){
		int num = x, val = 0;
		if(X<0){return false;}
		while(num!=0){
			val = val*10+num%10;
			num = num/10;
		}
		if(val == x){ return true;}
		else{return false;}
	}
}