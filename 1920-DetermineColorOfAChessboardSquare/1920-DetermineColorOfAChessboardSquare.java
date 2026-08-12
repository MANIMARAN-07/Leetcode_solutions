// Last updated: 12/08/2026, 11:10:25
class Solution {
    public boolean squareIsWhite(String c) {
        if((c.charAt(0)+c.charAt(1))%2 !=0)
        return true;
        else return false;
    }
}