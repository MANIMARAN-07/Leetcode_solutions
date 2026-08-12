// Last updated: 12/08/2026, 11:14:47
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
    int sum=(n*(n+1))/2;
    int ActualSum=0;
    for(int num:nums){
    ActualSum+=num;
    }
    int missingValue=sum-ActualSum;
    if(missingValue>0){
        return missingValue;}
    else{
        return 0;
    }
}
}