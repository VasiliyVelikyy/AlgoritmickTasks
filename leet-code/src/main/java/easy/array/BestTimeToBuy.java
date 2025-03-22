package easy.array;

/*
121. Best Time to Buy and Sell Stock
Easy Topics Companies
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.


Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 104*/
public class BestTimeToBuy {

    //anotherSolution
    //Runtime2 ms Beats 75.12%
    //Memory 60.81 MB Beats 95.29%
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
            profit = Math.max(profit, prices[i] - buyPrice);
        }
        return profit;
    }


    //My solution
    //Runtime 1 ms Beats 99.84%
    //Memory 61.39 MB Beats 87.66%
//    public int maxProfit(int[] prices) {
//        int maxProfit =0;
//        if (prices.length == 0) return 0;
//
//        int minPrice = prices[0];
//        int maxPrice = prices[0];
//
//        for (int i = 1; i < prices.length; i++) {
//            if (minPrice > prices[i]) {
//                minPrice = prices[i];
//                maxPrice = prices[i];//add tail
//            }
//            if (maxPrice < prices[i]) {
//                maxPrice = prices[i];
//                maxProfit = Math.max(maxProfit, maxPrice - minPrice);
//            }
//        }
//        return maxProfit > 0 ? maxProfit : 0;
//    }
}
