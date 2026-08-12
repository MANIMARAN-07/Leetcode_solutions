// Last updated: 12/08/2026, 11:15:32
class Solution {
    public int minSubArrayLen(int s, int[] a){
        if(a==null||a.length == 0){
            return 0;
        }
        int i=0;
        int j=0;
        int sum=0;
        int min=Integer.MAX_VALUE;
        while(j<a.length){
            sum+=a[j];
            j++;
            while(sum>=s){
                min=Math.min(min, j - i);
                sum-=a[i];
                i++;
            }
        }
        if (min == Integer.MAX_VALUE) {
            return 0;
        } else {
            return min;
        }
    }
}