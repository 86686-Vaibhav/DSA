class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Assignment3Q3{
    Node head;

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    public void insertAfter(int targetData, int newData) {
        Node current = head;
        while (current != null && current.data != targetData) {
            current = current.next;
        }
        if (current != null) {
            Node newNode = new Node(newData);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void insertBefore(int targetData, int newData) {
        if (head == null) return;
        if (head.data == targetData) {
            Node newNode = new Node(newData);
            newNode.next = head;
            head = newNode;
            return;
        }
        Node previous = null;
        Node current = head;
        while (current != null && current.data != targetData) {
            previous = current;
            current = current.next;
        }
        if (current != null) {
            Node newNode = new Node(newData);
            newNode.next = current;
            previous.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Assignment3Q3 list = new Assignment3Q3();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAfter(20, 25);
        list.insertBefore(10, 5);
        list.display();
    }
}
