class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int k = heights.length - 1;
        int result = 0;

        while (i < k) {
            int left = heights[i];
            int right = heights[k];
            int currArea = (k - i) * Math.min(left, right);

            if (currArea > result) {
                result = currArea;
            }

            if (left > right) {
                k--;
            } else {
                i++;
            }
        }

        return result;
    }
}
