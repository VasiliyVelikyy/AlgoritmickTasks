package easy.dynamic.fibonaci;

//
// 70. Climbing Stairs
/*You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?



Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step


Constraints:

1 <= n <= 45*/
public class ClimbingStairs {

    //My solution
    //Runtime 0ms Beats 100.00%of users with Java
    //Memory 39.08MB Beats 62.10%of users with Java
    //fibonacci algorithm
    public int climbStairs(int end) {
        int[] dp = new int[end + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= end; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[end];
    }
}
