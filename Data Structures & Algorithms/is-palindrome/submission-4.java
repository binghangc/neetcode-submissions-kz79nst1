class Solution {
    public boolean isPalindrome(String s) {
    int i = 0;
    int k = s.length() - 1;

    while (i < k) {
        while (i < k && !Character.isLetterOrDigit(s.charAt(i))) i++;
        while (i < k && !Character.isLetterOrDigit(s.charAt(k))) k--;

        if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(k))) {
            return false;
        }

        i++;
        k--;
    }

    return true;
}
}
