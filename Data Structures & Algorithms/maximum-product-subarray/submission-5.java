class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];

        int currMin = 1;
        int currMax = 1;

        for (int n: nums) {
            if (n == 0) {
                result = Math.max(result, 0);
                currMin = 1;
                currMax = 1;
                continue;
            }

            int temp = currMax * n;
            int maxCandidate = Math.max(n * currMax, n * currMin);
            currMax = Math.max(maxCandidate, n);

            int minCandidate = Math.min(temp, n * currMin);
            currMin = Math.min(minCandidate, n);
            result = Math.max(currMax, result);
        }

        return result;
    }
}
