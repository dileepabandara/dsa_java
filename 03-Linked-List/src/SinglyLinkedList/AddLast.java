package SinglyLinkedList;

public class AddLast {
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

    public static void addLast(int item) {
        if (head == null) {
            addFirst(item);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
        }
    }

    static void Display(Node currentNode) {
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
        // addFirst(0);
        addLast(4);
        Display(head);
    }

}