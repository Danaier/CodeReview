package csu.sword.on.offer.day2.p1;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Solution {
    public int[] reversePrint(ListNode head) {
        if (head==null) {
            return new int[0];
        }
        int num = 1;
        ListNode count = head;
        while(count.next!=null) {
            count = count.next;
            num++;
        }
        int[] arr = new int[num];
        for (int i=num-1;i>=0;i--) {
            arr[i] = head.val;
            head = head.next;
        }
        return arr;
    }
}