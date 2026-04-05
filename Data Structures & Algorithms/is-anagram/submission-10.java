class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> charTableS = new HashMap<>();
        HashMap<Character, Integer> charTableT = new HashMap<>();


        if (s.length() == 0 && t.length() == 0) {
            return true;
        } else if (s == null && t == null) {
            return true;
        } else if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char currentCharS = s.charAt(i);
            char currentCharT = t.charAt(i);

            charTableS.put(currentCharS, charTableS.getOrDefault(currentCharS, 0) + 1);
            charTableT.put(currentCharT, charTableT.getOrDefault(currentCharT, 0) + 1);
        }

        return charTableS.equals(charTableT);
    }
}
