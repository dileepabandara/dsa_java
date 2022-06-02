package SinglyLinkedList;

public class StartingFromHead {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static void display(Node currentNode) {
        while (currentNode != null) {
            System.out.println("Value:" + currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        head.next = node2;
        node2.next = node3;

        display(head);
    }
}
