class Solution {
    public int maxProfit(int[] prices) {
        int curr =  prices[0];
        int maxProfit = 0;
        for(int i = 1; i < prices.length; i++){
            int profit = prices[i] - curr;
            if(profit > maxProfit){
                maxProfit = profit;
            } else if(prices[i] < curr){
                curr = prices[i];
            }
        }
        return maxProfit;
    }
}
