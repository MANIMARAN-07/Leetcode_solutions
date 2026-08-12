// Last updated: 12/08/2026, 11:10:14
class Solution {
  public int maxFrequency(int[] nums, int k) {
    Arrays.sort(nums);
    long totalSum = 0;
    int left = 0;
    for (int right = 0; right < nums.length; right++) {
      totalSum += nums[right];
      if ((right - left + 1) * 1L * nums[right] > totalSum + k) {
        totalSum -= nums[left];
        left++;
      }
    }
    return nums.length - left;
  }
}

public class main {
  public static void main(String[] args) {
    int[] nums = new int[] { 1, 4, 8, 13 };
    int k = 3;
    int result = new Solution().maxFrequency(nums, k);

    System.out.println("The maximum possible frequency of an element after performing at most k operations is : " + result);
  }
}