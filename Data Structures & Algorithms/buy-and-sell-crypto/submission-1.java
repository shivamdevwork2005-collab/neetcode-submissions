// left = buying day
// right = selling day
// prices[right] - prices[left] = profit

// Maintain karna hai ki left hamesha right se pehle ho.

class Solution {
    public int maxProfit(int[] prices) {
        int left = 0; // buy
        int right = 1; // sell

        int maxProfit = 0;

        while (right < prices.length) {
            // Profitable transaction
            if (prices[right] > prices[left]) { // sell > buy
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // Found cheaper buying price at right.
                left = right;
            }

            right++;
        }

        return maxProfit;
    }
}