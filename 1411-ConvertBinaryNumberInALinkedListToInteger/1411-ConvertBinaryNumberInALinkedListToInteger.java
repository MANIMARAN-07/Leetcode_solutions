// Last updated: 12/08/2026, 11:11:24
class Solution {
    public int getDecimalValue(ListNode head) {
     int result = 0;
     while(head!=null){
        result = result*2 + head.val;
        head=head.next;
     }
     return result;
}
}