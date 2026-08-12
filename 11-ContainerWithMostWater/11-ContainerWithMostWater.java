// Last updated: 12/08/2026, 11:18:38
class Solution {
    public int maxArea(int[] h) 
    {
        int i=0,j=h.length-1,ans=0;
        while(i<j)
        {
            int t = Math.min(h[i],h[j]);
            ans = Math.max(ans,t*(j-i));
            if(h[i]<h[j]) i++;
            else j--;
        }
        return ans;
    }
}