class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int prevLeftMax = 0;
        int prevRightMax = 0;
        int acc = 0;
        int leftAcc = 0;
        int rightAcc = 0;

        while (left < right) {
            int rightHeight = height[right];
            int leftHeight = height[left];

            if (leftHeight > prevLeftMax) {
                acc += leftAcc;
                prevLeftMax = leftHeight;
                leftAcc = 0;
            }

            if (rightHeight > prevRightMax) {
                acc += rightAcc;
                prevRightMax = rightHeight;
                rightAcc = 0;
            }

            rightAcc += prevRightMax - rightHeight;
            leftAcc += prevLeftMax - leftHeight;

            if (leftHeight > rightHeight) {
                right--;
            } else {
                left++;
            }
        }
        acc += leftAcc + rightAcc;

        return acc;
    }
}
