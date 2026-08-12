// Last updated: 12/08/2026, 11:11:01
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}