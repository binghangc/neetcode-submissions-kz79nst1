class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hashS = new HashMap<>();
        HashMap<Character, Integer> hashT = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            
            int charCountS = hashS.getOrDefault(s.charAt(i), 0);
            int charCountT = hashT.getOrDefault(t.charAt(i), 0);
            hashS.put(s.charAt(i), charCountS + 1);
            hashT.put(t.charAt(i), charCountT + 1);
        }

        return hashS.equals(hashT);
    }
}
