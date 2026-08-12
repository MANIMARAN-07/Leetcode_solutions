// Last updated: 12/08/2026, 11:18:19
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n){
        if(head.next == null){
            return null;
        }
        ListNode temp= head;
        int size = 1;
        while(temp.next !=null){
            temp=temp.next;
            size++;
        }
        if(n == size){
            return head.next;
        }
        int i=1;
        ListNode temp1 = head;
        while(i< size-n){
            temp1= temp1.next;
           i++;
        } 
        temp1.next = temp1.next.next;
        return head;
    }
}

