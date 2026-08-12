// Last updated: 12/08/2026, 11:14:20
class Solution {
    public boolean isPowerOfFour(int n) {
      if(n==1)return true;
      if(n<=0 || n%4 != 0) return false;
      return isPowerOfFour(n/4);  
    }
}