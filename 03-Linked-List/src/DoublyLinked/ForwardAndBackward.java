package DoublyLinked;

public class ForwardAndBackward {
    static Node head; // head of list

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


    static void display(Node currentNode) {
        Node tail = null;
        System.out.println("Forward Direction:");
        while (currentNode != null) {
            System.out.println(currentNode.data);
            tail = currentNode;
            currentNode = currentNode.next;
        }
        currentNode = tail;
        System.out.println("Backward Direction:");
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.prev;
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
}
