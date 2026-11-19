class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) return null;

        ListNode temp = head;
        ListNode curr = head.next;

        while(curr != null){
            if(temp.val != curr.val){
                temp.next = curr;
                temp = temp.next;
            }
            curr = curr.next;
        }

        temp.next = null;

        return head;
    }
}