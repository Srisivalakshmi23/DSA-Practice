class Solution {
    public boolean isPalindrome(String s) {
         return isPalindromeRecursive(s, 0, s.length() - 1);
    }
    private boolean isPalindromeRecursive(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        char cLeft = s.charAt(left);
        char cRight = s.charAt(right);
        if (!Character.isLetterOrDigit(cLeft)) {
            return isPalindromeRecursive(s, left + 1, right);
        }
        if (!Character.isLetterOrDigit(cRight)) {
            return isPalindromeRecursive(s, left, right - 1);
        }
        if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight)) {
            return false;
        }
        return isPalindromeRecursive(s, left + 1, right - 1);
    }
}