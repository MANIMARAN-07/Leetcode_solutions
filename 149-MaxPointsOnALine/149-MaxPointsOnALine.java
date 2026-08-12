// Last updated: 12/08/2026, 11:16:15
class Solution {
    public int maxPoints(int[][] p) {
        int n = p.length;
        if (n <= 2) return n;
        int res = 2;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int count = 2;
                int dx1 = p[j][0] - p[i][0];
                int dy1 = p[j][1] - p[i][1];
                for (int k = j + 1; k < n; k++) {
                    int dx2 = p[k][0] - p[i][0];
                    int dy2 = p[k][1] - p[i][1];
                    if (dy1 * dx2 == dy2 * dx1) {
                        count++;
                    }
                }
                if (count > res) {
                    res = count;
                }
            }
            if (res >= n - i) break;
        }
        return res;
    }
}
