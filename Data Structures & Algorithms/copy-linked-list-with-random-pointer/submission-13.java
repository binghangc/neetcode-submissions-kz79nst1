/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        HashMap<Node, Node> oldToNew = new HashMap<>();

        // 1st pass: copy all nodes (next only)
        Node curr = head;
        while (curr != null) {
            oldToNew.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // 2nd pass: assign next and random pointers
        curr = head;
        while (curr != null) {
            Node copy = oldToNew.get(curr);
            copy.next = oldToNew.get(curr.next);
            copy.random = oldToNew.get(curr.random);
            curr = curr.next;
        }

        return oldToNew.get(head);
    }
}
