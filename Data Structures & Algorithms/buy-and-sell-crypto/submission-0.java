class Solution {
    public int maxProfit(int[] prices) {
        int pMax = 0;

        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                int tempMax = prices[j] - prices[i];
                if (tempMax > pMax) {
                    pMax = tempMax;
                }
            }
        }
         return pMax;

    }
}
