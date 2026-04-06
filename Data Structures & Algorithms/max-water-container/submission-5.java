class Solution {
    public int maxArea(int[] heights) {
        int maxRes = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int leftHeight = heights[left];
            int rightHeight = heights[right];

            int volume = Math.min(leftHeight, rightHeight) * (right - left);
            maxRes = Math.max(maxRes, volume);

            if (leftHeight > rightHeight) {
                right--;
            } else {
                left++;
            }
        }

        return maxRes;

    }
}
