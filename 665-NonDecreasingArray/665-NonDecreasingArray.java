// Last updated: 12/08/2026, 11:13:03
class Solution {
    public boolean checkPossibility(int[] nums) {
        for(int i = 1 ,e = 0; i < nums.length; i++)
        if (nums[i] < nums[i-1])
         if (e++ > 0 || (i > 1 && i < nums.length - 1 && nums[i-2] > nums[i] && nums[i+1] < nums[i-1]))
         return false;
         return true;
    }
}