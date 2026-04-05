class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            if (seen.contains(num)) {
                return num;
            }

            seen.add(num);
        }

        return -1;
    }
}
