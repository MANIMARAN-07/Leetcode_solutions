// Last updated: 12/08/2026, 11:10:36
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String s : words) {
            boolean isconsistent = true;
            for (char c : s.toCharArray()) {
                if (!allowed.contains(String.valueOf(c))) {
                    isconsistent = false;
                    break;
                }
            }
            if (isconsistent) {
                count++;
            }
        }
        return count;
    }
}