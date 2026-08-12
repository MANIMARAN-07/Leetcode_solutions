// Last updated: 12/08/2026, 11:11:36
class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low = 1, high = 0;
        for (int candy : candies) 
            high = Math.max(high, candy);
        int result = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            long count = 0;
            for (int candy : candies) 
                count += candy / mid;
            
            if (count >= k) { 
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}

