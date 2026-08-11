class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        // imagin each day as selling day;
        //  best  buy = 0 to i-1;
        int maxP = 0;
        int bestBuy = prices[0];

        for(int i=1;i<n;i++){
            int prof = prices[i]-bestBuy;
            maxP = Math.max(maxP , prof);
            bestBuy = Math.min(bestBuy,prices[i]);
        }
        return maxP;
    }
}
