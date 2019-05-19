/*

Given a sorted integer array without duplicates, 
return the summary of its ranges.
For example, given [0,1,2,4,5,7], 
return ["0->2","4->5","7"].


*/
import java.util.*;

class Solution{
    public List<String> summaryRange(int[] nums){
        List<String> ranges = new ArrayList<>();
        int n = num.length;
        if( n ==0) return ranges;

        int from = num[0], to = nums[0], prev = nums[0];
        for(int i = 1; i<n; i++){
            int curr = nums[i];
            if(curr - prev == 1){
                to = curr;
            }
            else{
                ranges.add(getRange(from, to));
                from = curr;
                to = curr;
            }
            prev = curr;


        }
        ranges.add(getRange(from, to));
        return ranges;
    }
    private String getRange(int from, int to){
        return (from == to )? Integer.toString: from +
        "->" + to;
    }
}