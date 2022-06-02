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
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.prev = head;
        second.next = third;
        third.prev = second;
        display(head);
    }

    static void display(Node currentNode) {
        while (currentNode != null) {
            System.out.println("Value:" + currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
