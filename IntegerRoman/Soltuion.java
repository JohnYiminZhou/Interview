/*
Given an integer, convert it to a roman numeral.
Input is guaranteed to be within the range from 1 to 3999.

Idea: hashmaps.
*/
class Solution{
private static final int[] values = {
    1000, 500, 
    100, 50,
    10, 5,
    1
};

private static final String[] symbol = {
    "M", "D",
    "C", "L",
    "X", "V",
    "I"
};

public int romanToInt(String s) {
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < symbol.length; i++)
        map.put(symbol[i], values[i]);
    
    int num = 0, prev = 0;
    for (int i = 0; i < s.length(); i++) {
        int curr = map.get(s.substring(i, i + 1));
        num += (curr > prev) ? (curr - 2 * prev) : curr;    // use subtractive rule
        prev = curr;
    }
    return num;
}
}