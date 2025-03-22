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
//    public int climbStairs(int end) {
//        int[] dp = new int[end + 1];
//        dp[0] = 1;
//        dp[1] = 1;
//        for (int i = 2; i <= end; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//        return dp[end];
//    }

    //recursion
    //this solution in leetcode Time Limit Exceeded
//    public int climbStairs(int end) {
//        if (end == 1 || end == 0) {
//            return 1;
//        }
//        int notlast=climbStairs(end - 1);
//        int last=climbStairs(end - 2);
//        int answ = notlast + last;
//        return answ;
//    }

    //memoisation
    //Runtime 0 ms Beats 100.00%
    //Memory 41.16 MB Beats 5.27%
//    public int climbStairs(int end) {
//        Map<Integer, Integer> map = new HashMap<>();
//        return recursMemo(end, map);
//    }
//
//    private int recursMemo(int end, Map<Integer, Integer> map) {
//        if (end == 1 || end == 0) {
//            return 1;
//        }
//        if (!map.containsKey(end)) {
//            map.put(end, recursMemo(end - 1, map) + recursMemo(end - 2, map));
//        }
//        return map.get(end);
//    }

    //other solution
    //optimisation space
    //Runtime 0 ms Beats 100.00%
    //Memory 40.22 MB Beats 81.60%
    public int climbStairs(int end) {
        int prev = 1, curr = 1;
        for (int i = 2; i <= end; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }
}
