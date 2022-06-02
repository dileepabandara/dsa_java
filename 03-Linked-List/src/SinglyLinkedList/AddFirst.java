package SinglyLinkedList;

public class AddFirst {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

        Node(int d, Node t) {
            data = d;
            next = t;
        }

    }


    public static void addFirst(int item) {
        head = new Node(item, head);
    }

    static void display(Node currentNode) {
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        head = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        head.next = node2;
        node2.next = node3;

        addFirst(1);

        display(head);
    }

}
