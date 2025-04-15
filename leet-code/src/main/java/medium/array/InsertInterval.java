package medium.array;

import java.util.LinkedList;

/*
* 57. Insert Interval
Medium
Topics
Companies
Hint
You are given an array of non-overlapping intervals intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.

Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).

Return intervals after the insertion.

Note that you don't need to modify intervals in-place. You can make a new array and return it.



Example 1:

Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]
Example 2:

Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
* Constraints:

0 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 105
intervals is sorted by starti in ascending order.
newInterval.length == 2
0 <= start <= end <= 105*/
public class InsertInterval {

    //other solution
    //Runtime 2 ms Beats 37.15%
    //Memory 45.28 MB Beats 15.28%
    public int[][] insert(int[][] intervals, int[] newInterval) {
        LinkedList<int[]> list = new LinkedList<>();
        int index = 0, intervalsSize = intervals.length;

        //add all intervals that are non-overlapping to the newInterval. Comparing end of old interval and begin of new interval
        //check left side
        while (index < intervalsSize && intervals[index][1] < newInterval[0]) {
            list.add(intervals[index++]);
        }


        //merge newOnterval with the overlapping intervals
        //check right side
        while (index < intervalsSize && intervals[index][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[index][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[index][1], newInterval[1]);
            index++;
        }

        list.add(newInterval);

        //add the remaining intervals onto the list
        //add other
        while (index < intervalsSize) {
            list.add(intervals[index++]);
        }

        return list.toArray(new int[list.size()][2]);
    }

}
