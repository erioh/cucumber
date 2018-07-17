package tester;

import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {
        Node node1 = new Node();
        node1.v = 1;
        Node node2 = new Node();
        node2.v = 2;
        Node node3 = new Node();
        node3.v = 3;
        Node node4 = new Node();
        node4.v = 4;
        Node node5 = new Node();
        node5.v = 5;
        Node node6 = new Node();
        node6.v = 6;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        System.out.println(node1);
        node1.reverse();


    }

    private static class Node {

        public Node next;
        public int v;

        public void reverse() {
            Node first = this;
            Node second = this.next;
            Node third = second.next;

            first.next = null;
            second.next = first;

            Node current = third;
            Node prev = second;
            while (current != null) {
                Node next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            System.out.println(prev);
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Node{");
            sb.append("next=").append(next);
            sb.append(", v=").append(v);
            sb.append('}');
            return sb.toString();
        }
    }
}
