/*
Given a string s consists of upper/lower-case alphabets 
and empty space characters ' ', 
return the length of last word in the string.
If the last word does not exist, return 0.


*/

class Solution{
    public int lengthOfLastWord(String s){
        int len = 0, last = s.length() -1;
        while (last>=0 && s.charAt(last)== ' ') last--;
        while (last >= 0 && s.charAt(last) != ' '){
            last--;
            len++;
        }
        return len;
    }
}