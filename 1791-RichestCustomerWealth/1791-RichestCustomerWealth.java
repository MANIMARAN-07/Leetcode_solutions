// Last updated: 12/08/2026, 11:10:31
class Solution {
    public int maximumWealth(int[][] arr) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
                if (max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }
}