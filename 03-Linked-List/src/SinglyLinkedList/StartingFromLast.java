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

    static void display(Node currentNode) {
        while (currentNode != null) {
            System.out.println("Value:" + currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        Node temp = new Node(4, null);
        temp = new Node(3, temp);
        temp = new Node(2, temp);
        head = new Node(1, temp);

        display(head);
    }
}
