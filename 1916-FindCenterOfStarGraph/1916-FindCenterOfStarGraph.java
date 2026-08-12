// Last updated: 12/08/2026, 11:10:28
class Solution {
    public int findCenter(int[][] e) {
        return e[0][0]==e[1][0] || e[0][0]==e[1][1]?e[0][0]:e[0][1];
    }
}