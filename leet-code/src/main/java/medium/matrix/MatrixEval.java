package medium.matrix;

/*542. 01 Matrix
Medium
Topics
Companies
Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.

The distance between two cells sharing a common edge is 1.



Example 1:


Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
Output: [[0,0,0],[0,1,0],[0,0,0]]
Example 2:


Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
Output: [[0,0,0],[0,1,0],[1,2,1]]


Constraints:

m == mat.length
n == mat[i].length
1 <= m, n <= 104
1 <= m * n <= 104
mat[i][j] is either 0 or 1.
There is at least one 0 in mat.


Note: This question is the same as 1765: https://leetcode.com/problems/map-of-highest-peak/
https://leetcode.com/problems/01-matrix/description/
*/

public class MatrixEval {

    //other solution
    //Runtime 7 ms Beats 97.79%
    //Memory /48.07 MB Beats 17.56%
    public int[][] updateMatrix(int[][] mat) {
        int[][] distance = new int[mat.length][mat[0].length];
        int maxPossibleDistance = mat.length - 1 + mat[0].length - 1;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != 0) {
                    int upCell = (i > 0) ? distance[i - 1][j] : maxPossibleDistance;
                    int leftCell = (j > 0) ? distance[i][j - 1] : maxPossibleDistance;
                    distance[i][j] = Math.min(upCell, leftCell) + 1;
                }
            }

        }

        for (int i = mat.length - 1; i >= 0; i--) {
            for (int j = mat[0].length - 1; j >= 0; j--) {
                if (mat[i][j] != 0) {
                    int downCell = (i < mat.length - 1) ? distance[i + 1][j] : maxPossibleDistance;
                    int rightCell = (j < mat[0].length - 1) ? distance[i][j + 1] : maxPossibleDistance;
                    distance[i][j] = Math.min(Math.min(downCell, rightCell) + 1, distance[i][j]);
                }
            }

        }
        return distance;
    }
}
