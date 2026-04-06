class Solution {
    public boolean isPermutation(String s3, String s4) {
            if (s3.length() != s4.length()) {
                return false;
            }

            Map<Character, Integer> s3Map = new HashMap<>();
            Map<Character, Integer> s4Map = new HashMap<>();

            for (int i = 0; i < s3.length(); i++) {
                char c3 = s3.charAt(i);
                char c4 = s4.charAt(i);

                s3Map.put(c3, s3Map.getOrDefault(c3, 0) + 1);
                s4Map.put(c4, s4Map.getOrDefault(c4, 0) + 1);
            }

            return s3Map.equals(s4Map);
        }
    public boolean checkInclusion(String s1, String s2) {

        int left = 0;
        StringBuilder str2 = new StringBuilder();

        
        for (int right = 0; right < s2.length(); right++) {
            char currChar = s2.charAt(right);
            str2.append(currChar);

            if (right - left + 1 < s1.length()) {
                continue;
            }

            if (isPermutation(s1, str2.toString())) {
                return true;
            }

            if (right - left + 1 >= s1.length()) {
                left++;
                str2.deleteCharAt(0);
                continue;
            }

        }
        return false;
    }
}
