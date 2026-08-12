// Last updated: 12/08/2026, 11:18:06
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode res=new ListNode(-1);
        res.next=head;
        ListNode temp=res;
        
        while(temp.next!=null && temp.next.next!=null){
        ListNode first=temp.next;
        ListNode second = temp.next.next;
            first.next=second.next;
            second.next=first;
            temp.next=second;

            temp=first; 

        }
        return res.next;
    }
}