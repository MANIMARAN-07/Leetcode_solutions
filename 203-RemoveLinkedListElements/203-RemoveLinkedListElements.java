// Last updated: 12/08/2026, 11:15:44
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head = head.next;
        }
        ListNode current = head;
        while(current!=null && current.next!=null){
            if(current.next.val ==val){
             current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
    }
}