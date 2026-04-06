class Solution {
    public int characterReplacement(String s, int k) {
        int maxChar = 0;
        int result = 0;
        int left = 0;


        Map<Character, Integer> charMap = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            int currFreq = charMap.getOrDefault(c, 0);
            currFreq += 1;
            maxChar = Math.max(currFreq, maxChar);
            charMap.put(c, currFreq);


            if ((right - left + 1) - maxChar <= k) {
                result = Math.max(result, right - left + 1);
            } else {
                char leftChar = s.charAt(left);
                charMap.put(leftChar, charMap.getOrDefault(leftChar, 0) - 1);
                left++;
            }
        }

        return result;
    }
}
