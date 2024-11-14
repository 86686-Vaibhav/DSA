class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Assignment4Q1 {
    Node tail;

    public Assignment4Q1() {
        this.tail = null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            tail = newNode;
            newNode.next = tail; 
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode; 
        }
    }

    public void insertAfter(int targetData, int newData) {
        if (tail == null) return; 
        Node current = tail.next;
        do {
            if (current.data == targetData) {
                Node newNode = new Node(newData);
                newNode.next = current.next;
                current.next = newNode;
                if (current == tail) {
                    tail = newNode; 
                    }
                
                return;
            }
            current = current.next;
        } while (current != tail.next); 
    }

    public void insertBefore(int targetData, int newData) {
        if (tail == null) return; 
        Node current = tail.next; 
        Node previous = tail;

        do {
            if (current.data == targetData) {
                Node newNode = new Node(newData);
                previous.next = newNode;
                newNode.next = current;
                if (current == tail.next) {
                    tail.next = newNode; 
                }
                return;
            }
            previous = current;
            current = current.next;
        } while (current != tail.next); 
    }

    public void delete(int data) {
        if (tail == null) return; 
        Node current = tail.next;
        Node previous = tail;

        do {
            if (current.data == data) {
                if (current == tail) {
                    if (current.next == tail) {
                        tail = null; 
                    } else {
                        tail = previous;
                    }
                }
                previous.next = current.next;
                return;
            }
            previous = current;
            current = current.next;
        } while (current != tail.next); 
    }

    public void display() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = tail.next; 
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != tail.next); 
        System.out.println("...");
    }

    public static void main(String[] args) {
        Assignment4Q1 list = new Assignment4Q1();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAfter(20, 25);
        list.insertBefore(10, 5);
        list.display();
        list.delete(20);
        list.display();
    }
}