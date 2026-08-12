// Last updated: 12/08/2026, 11:12:27
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count++;
            }
        }
        return nums;
    }
}