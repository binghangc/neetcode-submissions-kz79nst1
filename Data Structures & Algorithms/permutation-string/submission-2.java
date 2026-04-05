class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> s1freq = new HashMap<>();
        HashMap<Character, Integer> winFreq = new HashMap<>();
        int matches = 0;
        int left = 0;

        for (char c : s1.toCharArray()) {
            s1freq.put(c, s1freq.getOrDefault(c, 0) + 1);
        }


        for (int right = 0; right < s2.length(); right++) {
            char curr = s2.charAt(right);
            int beforeIn = winFreq.getOrDefault(curr, 0);
            int afterIn = beforeIn + 1;
            winFreq.put(curr, afterIn);

            if (s1freq.containsKey(curr)) {
                if (afterIn == s1freq.get(curr)) matches++;
                if (beforeIn == s1freq.get(curr)) matches--;
            }

            while (right - left + 1 > s1.length()) {
                char out = s2.charAt(left++);
                int beforeOut = winFreq.get(out);
                int afterOut = beforeOut - 1;

                if (s1freq.containsKey(out)) {
                    if (beforeOut == s1freq.get(out)) matches--;
                    if (afterOut == s1freq.get(out)) matches++;
                }

                if (afterOut == 0) winFreq.remove(out);
                else winFreq.put(out, afterOut);
            }

            if (right - left + 1 == s1.length() && matches == s1freq.size()) return true;
        }

        return false;
    }
}
