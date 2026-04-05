class Solution {
    public int maxProfit(int[] prices) {
        int currLow = Integer.MAX_VALUE;
        int maxSell = 0;

        for (int i : prices) {
            if (i < currLow) {
                currLow = i;
            }

            int currProfit = i - currLow;

            if (currProfit > maxSell) {
                maxSell = currProfit;
            }
        }

        return maxSell;
    }
}
