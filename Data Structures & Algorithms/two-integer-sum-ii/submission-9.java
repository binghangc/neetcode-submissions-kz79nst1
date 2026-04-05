class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int k = 0;
        int p = numbers.length - 1;

        while (k < p) {
            int low = numbers[k];
            int high = numbers[p];

            if (low + high < target) k++;
            if (low + high > target) p--;
            if (low + high == target) {
                int[] result = {k + 1, p + 1};
                return result;
            }
        }
        return null;
    }
}
