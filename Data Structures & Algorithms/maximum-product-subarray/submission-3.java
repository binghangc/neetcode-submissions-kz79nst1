class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];

        int currMin = 1;
        int currMax = 1;

        for (int n : nums) {
            if (n == 0) {
                result = Math.max(result, 0);
                currMin = 1;
                currMax = 1;
                continue;
            }

            int temp = currMax * n;

            currMax = Math.max(Math.max(temp, currMin * n), n);
            currMin = Math.min(Math.min(temp, currMin * n), n);

            result = Math.max(result, currMax);
        }

        return result;
    }
}