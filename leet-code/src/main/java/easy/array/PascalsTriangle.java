package easy.array;

import java.util.ArrayList;
import java.util.List;

/*
* 118. Pascal's Triangle
Easy
Topics
premium lock icon
Companies
Given an integer numRows, return the first numRows of Pascal's
* triangle.

In Pascal's triangle, each number is the sum of the two numbers
* directly above it as shown:
Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]]


Constraints:

1 <= numRows <= 30*/
public class PascalsTriangle {

    //My solution
    // Runtime 1 ms Beats84.68%
    // Memory 42.18 MB Beats 41.00%
    // public List<List<Integer>> generate(int numRows) {
    //     List<List<Integer>> result = new ArrayList<>();
    //     int side = 1;
    //
    //     for (int i = 0; i < numRows; i++) {
    //         List<Integer> row = new ArrayList<>(i + 1);
    //         for (int j = 0; j < i + 1; j++) {
    //             if (j == 0 || j == i) {
    //                 row.add(side);
    //             } else {
    //                 var lastRow = result.get(i - 1);
    //                 var sumNear = lastRow.get(j) + lastRow.get(j - 1);
    //                 row.add(sumNear);
    //             }
    //         }
    //         result.add(row);
    //     }
    //     return result;
    // }

    //Other solution
    //Runtime 1ms Beats84.68%
    // Memory 42.18 MB Beats41.00%
    // public List<List<Integer>> generate(int numRows) {
    //     if (numRows == 0) {
    //         return new ArrayList<>();
    //     }
    //     if (numRows == 1) {
    //         List<List<Integer>> result = new ArrayList<>() {{
    //             add(List.of(1));
    //         }};
    //         return result;
    //     }
    //     List<List<Integer>> prevRows = generate(numRows - 1);
    //     List<Integer> newRow = new ArrayList<>();
    //
    //     for (int i = 0; i < numRows; i++) {
    //         newRow.add(1);
    //     }
    //
    //     for (int i = 1; i < numRows - 1; i++) {
    //         newRow.set(i, prevRows.get(numRows - 2).get(i) + prevRows.get(numRows - 2).get(i - 1));
    //     }
    //     prevRows.add(newRow);
    //     return prevRows;
    // }

    //Runtime
    // 1 ms Beats 84.68%
    // Memory 42.05 MB Beats60.54%
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }

        if (numRows == 1) {
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            result.add(firstRow);
            return result;
        }

        result = generate(numRows - 1);
        List<Integer> prevRow = result.get(numRows - 2);
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);

        for (int i = 1; i < numRows - 1; i++) {
            currentRow.add(prevRow.get(i - 1) + prevRow.get(i));
        }

        currentRow.add(1);
        result.add(currentRow);

        return result;
    }
}
