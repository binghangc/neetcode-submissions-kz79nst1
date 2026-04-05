class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int longestLength = 0;
        HashSet<Character> seen = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (seen.contains(c)) {
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(c);
            longestLength = Math.max(longestLength, right - left + 1);
        }

        return longestLength;
    }
}
