class Solution {
    public int longestConsecutive(int[] nums) {
        int resultMax = 0;
        HashSet<Integer> help = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            help.add(nums[i]);
        }

        for (int num : help) {
            if (!help.contains(num - 1)) {
                int k = 1;
                int currResult = 1;
                while (help.contains(num + k)) {
                    k++;
                    currResult++;
                }
                if (currResult > resultMax) {
                    resultMax = currResult;
                }
            } 
        }
        return resultMax;
    }
}
