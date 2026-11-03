
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void Display() {
        if (head == null) {
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void reverseLL() {
        Node temp = head;
        Node pre = null;
        Node next = null;

        while (temp != null) {
            next = temp.next;
            temp.next = pre;
            pre = temp;
            temp = next;
        }

        head = pre;

    }

    void findSmallest() {
        if (head == null) {
            return;
        }

        Node temp = head;
        int min = Integer.MAX_VALUE;
        while (temp != null) {
            min = Math.min(min, temp.data);
            temp = temp.next;
        }
        System.out.println(min);
    }
}

public class LinkedListBasic {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        // ll.Display();

        // ll.reverseLL();

        // ll.Display();

        ll.findSmallest();

    }

}