import java.util.Scanner;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class reverselinkedlist {

    // Reverse Linked List
    public static Node reverse(Node head) {

        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Print Linked List
    public static void print(Node head) {

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        System.out.println("Enter node values:");

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {

                head = newNode;
                tail = newNode;

            } else {

                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("\nOriginal Linked List:");
        print(head);

        head = reverse(head);

        System.out.println("\nReversed Linked List:");
        print(head);

        sc.close();
    }
}