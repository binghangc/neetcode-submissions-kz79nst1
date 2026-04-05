class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                prefix[i] = 1;
            } else {
                prefix[i] = prefix[i - 1] * nums[i - 1];
            }

        }

        for (int p = nums.length - 1; p >= 0; p--) {
            if (p == nums.length - 1) {
                suffix[p] = 1;
            } else {
                suffix[p] = suffix[p + 1] * nums[p + 1];
            }
        }

        for (int k = 0; k < nums.length; k++) {
            result[k] = prefix[k] * suffix[k];
        }

        return result;
    }

}  
