class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !isAlphanumeric(s.charAt(left))) {
                left++;
            }

            while (left < right && !isAlphanumeric(s.charAt(right))) {
                right--;
            }

            char charLeft = Character.toLowerCase(s.charAt(left));
            char charRight = Character.toLowerCase(s.charAt(right));

            if (charLeft != charRight) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }


    public boolean isAlphanumeric(char c) {
        return ('A' <= c && c <= 'Z') ||
               ('a' <= c && c <= 'z') ||
               ('0' <= c && c <= '9');
    }
}
