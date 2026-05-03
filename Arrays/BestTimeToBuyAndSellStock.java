package Arrays;
// Problem: Best Time to Buy and Sell Stock

// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Approach: Optimal (Greedy)

public class BestTimeToBuyAndSellStock {
  public static int maxProfit(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int price : prices) {
      if (price < minPrice) {
        minPrice = price;
      } else {
        int profit = price - minPrice;
        maxProfit = Math.max(maxProfit, profit);
      }
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int Prices[] = { 2, 1, 6, 8, 9 };
    int result = maxProfit(Prices);
    System.out.println("Maximum Profit : " + result);
  }
}
