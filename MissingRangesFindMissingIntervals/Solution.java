/*
Given a sorted integer array where 
the range of elements are [lower, upper] inclusive, 
return its missing ranges.
For example, given [0, 1, 3, 50, 75], 
lower = 0 and upper = 99, 
return ["2", "4->49", "51->74", "76->99"].

Java List requires java.util.*
*/
 import java.util.*;
class Solution{
    public List<String> findMissingRanges(int[] A, int lower, int upper) {
        List<String> ranges = new ArrayList<>();
        int prev = lower - 1;
        for (int i = 0; i <= A.length; i++) {
            int curr = (i == A.length) ? upper + 1 : A[i];
            if (curr - prev >= 2)   ranges.add(getRange(prev + 1, curr - 1));
            prev = curr;
        }
        return ranges;
    }
    
    private String getRange(int from, int to) {
        return (from == to) ? Integer.toString(from) : from + "->" + to;
    }
    
}


