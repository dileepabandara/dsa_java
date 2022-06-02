package DoublyLinked;

public class StartingFromHead {

    static Node head;

    static class Node {
        Node prev;
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.next = node2;
        node2.prev = head;
        node2.next = node3;
        node3.prev = node2;
        display(head);
    }

    static void display(Node currentNode) {
        while (currentNode != null) {
            System.out.println("Value:" + currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
