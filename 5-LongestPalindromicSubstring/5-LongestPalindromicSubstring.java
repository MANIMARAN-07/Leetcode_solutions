// Last updated: 12/08/2026, 11:18:59
class Solution {
private int start = 0, maxLen = 0;
public String longestPalindrome(String s) {
   for(int i = 0; i < s.length(); i ++){
        expand(s, i, i);
        expand(s, i, i + 1); 
}
    return s.substring(start, start + maxLen);
    }
    void expand(String s, int left, int right)
    {
    while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
    {
        left --;
        right ++;
    }
    int len = right - left - 1;
    if(len > maxLen)
        {
        maxLen = len;
        start = left + 1;
        }
    }
}