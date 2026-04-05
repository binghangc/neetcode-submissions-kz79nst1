class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int prevailingLeftMax = height[0];
        int prevailingRightMax = height[len - 1];
        int[] maxLeft = new int[len];
        int[] maxRight = new int[len];
        int[] volume = new int[len];
        int totalVolume = 0;

        for (int i = 1; i < len; i++) {
            maxLeft[i] = prevailingLeftMax;
            
            if (height[i] > prevailingLeftMax) {
                prevailingLeftMax = height[i];
            }
        }

        for (int k = len - 2; k >= 0; k--) {
            maxRight[k] = prevailingRightMax;

            if (height[k] > prevailingRightMax) {
                prevailingRightMax = height[k];
            }
        }

        for (int p = 0; p < len; p++) {
            volume[p] = Math.max(0, Math.min(maxLeft[p], maxRight[p]) - height[p]);
        }

        for (int r = 0; r < len; r++) {
            totalVolume += volume[r];
        }

        return totalVolume;
    }
}
