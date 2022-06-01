package SinglyLinkedList;

public class StartingFromLast {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d, Node t) {
            data = d;
            next = t;
        }
    }

    public static void main(String[] args) {
        Node temp = new Node(17, null);
        temp = new Node(23, temp);
        temp = new Node(97, temp);
        head = new Node(44, temp);
        display(head);
    }

    static void display(Node currentNode) {
        while (currentNode != null) {
            System.out.println("Value:" + currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
