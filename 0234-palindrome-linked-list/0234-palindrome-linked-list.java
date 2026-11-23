class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode temp = head;
        int size = 0;

        while(temp != null) {
            size++;
            temp = temp.next;
        }

        temp = head;

        for(int i = 0; i < size / 2; i++) {
            temp = temp.next;
        }

        if(size % 2 != 0) {
            temp = temp.next;
        }

        cur = temp;

        for(int i = 0; i < size / 2; i++) {
            ListNode fwd = cur.next;
            cur.next = prev;
            prev = cur;
            cur = fwd;
        }

        cur = head;

        while(prev != null) {
            if(prev.val != cur.val) return false;

            prev = prev.next;
            cur = cur.next;
        }

        return true;
    }
}