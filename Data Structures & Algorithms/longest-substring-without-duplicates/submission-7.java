class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int longestLength = 0;
        HashSet<Character> seen = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);

            while (seen.contains(currChar)) {
                seen.remove(s.charAt(left));
                left++;                
            }

            seen.add(currChar);
            longestLength = Math.max(longestLength, right - left + 1);
        }

        return longestLength;
    }
}
