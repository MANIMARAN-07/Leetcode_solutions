// Last updated: 12/08/2026, 11:11:45
class Solution {
    public int dayOfYear(String d) {
        String[] s = d.split("-");
        int y = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int d1 = Integer.parseInt(s[2]);
        int[] a = {31,28,31,30,31,30,31,31,30,31,30,31};
        int t = d1;
        for (int i = 0; i < m - 1; i++) {
            t += a[i];
        }
        if (f(y) && m > 2) {
            t++;
        }
        return t;
    }
    private boolean f(int y) {
        return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
    }
}