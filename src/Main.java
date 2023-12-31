import java.io.IOException;
import java.util.Scanner;

class ReverseLinkedListRecursive {
    static class Node {
        public int data;
        public Node next;
        public Node(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    static class LinkedList {
        public Node head;
        public LinkedList() {
            this.head = null;
        }
        public void insertNode(int nodeData) {
            Node node = new Node(nodeData);

            if (this.head != null) {
                node.next = head;
            }
            this.head = node;
        }
    }
    public static void printSinglyLinkedList(Node node,
                                             String sep) throws IOException {

        while (node != null) {
            System.out.print(String.valueOf(node.data) + sep);
            node = node.next;
        }
    }
    static Node reverse(Node head) {

        if(head == null) {
            return head;
        }
        if(head.next == null) {
            return head;
        }
        Node newHeadNode = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHeadNode;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        LinkedList llist = new LinkedList();

        llist.insertNode(1);
        llist.insertNode(2);
        llist.insertNode(3);
        llist.insertNode(4);
        llist.insertNode(5);
        llist.insertNode(6);
        llist.insertNode(7);
        llist.insertNode(8);
        llist.insertNode(9);
        llist.insertNode(10);

        System.out.println("First linked list:");
        printSinglyLinkedList(llist.head, " ");
        System.out.println();
        System.out.println("Reversed Linked list:");
        Node llist1 = reverse(llist.head);
        printSinglyLinkedList(llist1, " ");

        scanner.close();
    }
}

