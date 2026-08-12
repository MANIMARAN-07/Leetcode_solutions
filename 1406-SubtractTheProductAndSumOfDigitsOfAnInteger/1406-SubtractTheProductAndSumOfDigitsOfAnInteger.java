// Last updated: 12/08/2026, 11:11:27
class Solution {
    public int subtractProductAndSum(int n) {
        int p=1,s=0;
        for(int x=n;x>0;x/=10){
           int d= x%10;
            p*=d;
            s+=d;
        }
        return p-s;
    }
}