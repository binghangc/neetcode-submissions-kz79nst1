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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);

        if (l2 == null) {
            return l1;
        } else if (l1 == null) {
            return l2;
        }

        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode resultPtr = result;

        while (!(ptr1 == null && ptr2 == null)) {

            if (ptr1 == null) {
                ptr1 = new ListNode(0);
            } else if (ptr2 == null) {
                ptr2 = new ListNode(0);
            }

            int val1 = ptr1.val;
            int val2 = ptr2.val;

            int sum = val1 + val2 + resultPtr.val;

            int currVal = sum % 10;

            if (sum >= 10) {
                resultPtr.val = currVal;
                resultPtr.next = new ListNode(1);         
                resultPtr = resultPtr.next;
            } else { 
                resultPtr.val = currVal;

                if (ptr1.next == null && ptr2.next == null) {
                    break;
                }

                resultPtr.next = new ListNode(0);
                resultPtr = resultPtr.next;
            }

            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

    
        return result;
    }
}
