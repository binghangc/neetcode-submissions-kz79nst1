class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> seen = new HashMap<>();
        int left = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {
            char incomingChar = s.charAt(right);

            if (seen.containsKey(incomingChar)) {
                int idx = seen.get(incomingChar);
                left = Math.max(left, idx + 1);
            }

            seen.put(incomingChar, right);
            result = Math.max(right - left + 1, result);
        }

        return result;
    }
}
