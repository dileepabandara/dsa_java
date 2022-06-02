package SinglyLinkedList;

public class InsertAfter {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d, Node t) {
            data = d;
            next = t;
        }
    }

    public static void addFirst(int item) {
        head = new Node(item, head);
    }

    public static void insertAfter(int key, int toInsert) {
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp != null) {
            temp.next = new Node(toInsert, temp.next);
        }
    }

    static void display(Node currentNode) {
        while (currentNode != null) {
            System.out.println("Value:" + currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        head = null;
        addFirst(4);
        addFirst(3);
        addFirst(1);

        insertAfter(3, 2);

        display(head);
    }

}
