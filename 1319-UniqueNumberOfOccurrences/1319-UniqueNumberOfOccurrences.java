// Last updated: 12/08/2026, 11:11:41
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int size = arr.length;
        int min = arr[0],  max = arr[0];

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        int range = max - min + 1;
        int[] freq = new int[range + 1];
        for (int i = 0; i < size; i++) {
            freq[max - arr[i]]++;
        }

        boolean[] check = new boolean[size + 1];
        for (int i = 0; i < range; i++) {
            if (freq[i] == 0) continue;
            if (check[freq[i]]) {
                return false;
            } else {
                check[freq[i]] = true;
            }
        }

        return true;
    }
}