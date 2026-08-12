// Last updated: 12/08/2026, 11:08:51
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int sum1=0;
            for(int j=i;j<n;j++){
                sum1=sum1+nums.get(j);
                if(sum1>0 && (j-i+1)>=l && (j-i+1)<=r){
                    mini=Math.min(mini,sum1);
                }
            }
        }
        if(mini==Integer.MAX_VALUE){
            return -1;
        }
        return mini;

    }
}