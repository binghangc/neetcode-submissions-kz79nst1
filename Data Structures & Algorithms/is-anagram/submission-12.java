class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] freqArr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            freqArr[cs - 'a']++;
            freqArr[ct - 'a']--;
        }

        for (int val : freqArr) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
