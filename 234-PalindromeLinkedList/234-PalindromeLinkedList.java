// Last updated: 12/08/2026, 11:15:07
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow =head;
        ListNode fast =head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode sechalf = reverse(slow);
        ListNode firhalf = head;

        while(sechalf!=null){
            if(firhalf.val!=sechalf.val){
                return false;
            }
            firhalf=firhalf.next;
            sechalf=sechalf.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        ListNode prev =null;
        while(head!=null){
            ListNode next = head.next;
            head.next = prev;
            prev =head;
            head = next;
        }
        return prev;
    }
}