// Last updated: 12/08/2026, 11:15:41
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        int[] isPrime = new int[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            isPrime[i] = 1;
        }
        for (int i = 2; i < n; i++) {
            if (isPrime[i] == 1) {
                count++;
                for (long j = (long) i * i; j < n; j += i) {
                    isPrime[(int) j] = 0;
                }
            }
        }
        return count;
    }
}