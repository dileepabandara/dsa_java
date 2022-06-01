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

    public static void main(String[] args) {
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.next = third;
        display(head);
    }

    static void display(Node currentNode) {
        while (currentNode != null) {
            System.out.println("Value:" + currentNode.data);
            currentNode = currentNode.next;
        }
    }
}