// Last updated: 12/08/2026, 11:16:13
class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        for(int num:nums){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
}