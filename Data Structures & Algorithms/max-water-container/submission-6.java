class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxRes = 0;

        while (left < right) {
            int leftHeight = heights[left];
            int rightHeight = heights[right];
            maxRes = Math.max(maxRes, Math.min(leftHeight, rightHeight) * (right - left));

            if (leftHeight < rightHeight) {
                left++;
            } else {
                right--;
            }
        }

        return maxRes;
    }
}
