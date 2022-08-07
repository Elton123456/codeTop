package com.jd.yibo.hash;

import java.util.HashMap;

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

public class CopyRandomListSolution_138 {
    public static void main(String[] args) {

    }

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        HashMap<Node, Node> map = new HashMap<>();
        Node h = head;
        while (h != null) {
            Node t = new Node(h.val);
            map.put(h, t);
            h = h.next;
        }
        h = head;
        while (h != null) {
            if (h.next != null) {
                map.get(h).next = map.get(h.next);
            }
            if (h.random != null) {
                map.get(h).random = map.get(h.random);
            }
            h = h.next;
        }
        return map.get(head);
    }
}
