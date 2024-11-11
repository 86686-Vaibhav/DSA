class QueueNode {
    int data;
    QueueNode next;

    QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Assignment4Q2_B {
    QueueNode front, rear;

    public Assignment4Q2_B() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {
        QueueNode newNode = new QueueNode(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1; 
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public void display() {
        QueueNode current = front;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Assignment4Q2_B queue = new Assignment4Q2_B();
        queue.enqueue(50);
        queue.enqueue(100);
        queue.enqueue(70);
        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
        System.out.println("Peek: " + queue.peek());
    }
}
