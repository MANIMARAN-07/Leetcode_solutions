// Last updated: 12/08/2026, 11:18:12
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1= list1;
        ListNode temp2 = list2;
     ListNode res = new ListNode(-1);
     ListNode tail =res;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
               tail.next=temp1;
               temp1=temp1.next;
            }
            else {
                tail.next= temp2;
                temp2=temp2.next;
            }
            tail=tail.next;
    } 
   
    if(temp1!=null){
        tail.next=temp1;
    }
    else{
        tail.next=temp2;
    }
    return res.next;
    
   
}
}