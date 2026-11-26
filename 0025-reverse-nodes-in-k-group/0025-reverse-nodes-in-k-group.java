/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1||head==null||head.next==null){
            return head;
        }
        ListNode s = head;
        ListNode e = head;
        int i = 1;

        while(i<=k){
            if(e==null) return head;
            e = e.next;
            i++;
        }
        ListNode newNode = reverse(s,e);
        s.next = reverseKGroup(e, k);

        return newNode;
    }

    public ListNode reverse(ListNode s,ListNode e){
    ListNode cur = s;
    ListNode prev = null;
    ListNode fwd = s.next;

    while(cur!=e){
        fwd = cur.next;
        cur.next = prev;
        prev = cur;
        cur = fwd;
    }
    return prev;
}
}

