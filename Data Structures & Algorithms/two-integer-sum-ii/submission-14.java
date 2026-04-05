class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> complementMap = new HashMap<>();
        for (int i = 1; i <= numbers.length; i++) {
            int complement = target - numbers[i - 1];
            if (complementMap.containsKey(complement)) {
                return new int[]{complementMap.get(complement), i};
            }

            complementMap.put(numbers[i - 1], i);
        }

        return null;
    }
}
