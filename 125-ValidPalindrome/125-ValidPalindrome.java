// Last updated: 12/08/2026, 11:16:27
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder clean = new StringBuilder();
        if (s.isEmpty()) {
            return true;
        }

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)){
                clean.append(Character.toLowerCase(c));
            }
        }
        int start = 0;
        int end = clean.length() - 1;

        while (start < end) {
            if (clean.charAt(start) != clean.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}