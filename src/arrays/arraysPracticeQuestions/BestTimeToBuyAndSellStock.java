package arrays.arraysPracticeQuestions;

public class BestTimeToBuyAndSellStock {
    /*
    Best Time to Buy and Sell Stock - LeetCode 121
    You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy one stock and choosing a different day
    in the future to sell that stock. Return the maximum profit you can achieve from this transaction.
    If you cannot achieve any profit, return 0.

    Example:
    Input: prices = [7, 1, 5, 3, 6, 4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     */

    public static int maxProfit(int[] prices) {
        // TODO - Loop through to get the least price, then compare it to the maxProfit
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        // TODO - Return maxProfit
        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }
}
