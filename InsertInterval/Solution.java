/*
Given a set of non-overlapping intervals, 
insert a new interval into the intervals 
(merge if necessary).
You may assume that the intervals were 
initially sorted according to their start times.
Example 1:
Given intervals [1,3],[6,9], 
insert and merge [2,5] in as [1,5],[6,9].
Example 2:
Given [1,2],[3,5],[6,7],[8,10],[12,16], 
insert and merge [4,9] in as [1,2],[3,10],[12,16].
This is because the new interval [4,9] 
overlaps with [3,5],[6,7],[8,10].

Idea: merge if overlap
use class interval represent period.
Question is what packet than contain interval class?
*/
import java.util.*;
import java.lang.*;

class Solution{
    public List<Integer> insert(List<Interval> intervals, 
    Interval newInterval){
        List<Interval> list = new ArrayList<>();
        Interval newIntervalCopy = new Interval(newInterval.start,
        newInterval.end);
        for(int i = 0; i< intervals.size();i++){
            Interval ranges = intervals.get(i);
            if(newIntervalCopy.end < range.start){
                list.add(newIntervalCopy);
                list.addAll(intervals.subList(i, intervals.size()));
                return list;
            }
            else if(newIntervalCopy.start > range.end) {
                list.add(range);
            }
            else{
                newIntervalCopy.start = Math.min(newIntervalCopy.start,
                range.start);
                newIntervalCopy.end = Math.max(newIntervalCopy.end,
                range.end);

            }
           
        }
        list.add(newIntervalCopy);
        return list;
    }
}