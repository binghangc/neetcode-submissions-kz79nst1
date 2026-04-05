class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int result = 0;

        for (int right = 0; right < prices.length; right++) {
            if (prices[right] <= prices[left]) {
                left = right;
                continue;
            }

            result = Math.max(result, prices[right] - prices[left]);
        }

        return result;
    }
}
