class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int result = 0;
        int highestFreq = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            highestFreq = Math.max(highestFreq, freq.get(c));

            if ((right - left + 1) - highestFreq > k) {
                char leftc = s.charAt(left);
                freq.put(leftc, freq.get(leftc) - 1);
                left++;
            }

            result = Math.max(result, right - left + 1);
        }


        return result;
    }
}
