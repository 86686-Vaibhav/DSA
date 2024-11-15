import java.util.ArrayList;
import java.util.List;

class MaxHeap {
    private List<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    public void add(int value) {
        heap.add(value);
        int index = heap.size() - 1;
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index) <= heap.get(parent)) break;
            swap(index, parent);
            index = parent;
        }
    }

    public int remove() {
        if (heap.isEmpty()) return -1;
        int root = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapify(0);
        }
        return root;
    }

    public int peek() {
        return heap.isEmpty() ? -1 : heap.get(0);
    }

    private void heapify(int index) {
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < heap.size() && heap.get(left) > heap.get(largest)) largest = left;
        if (right < heap.size() && heap.get(right) > heap.get(largest)) largest = right;
        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}

public class Assignment6Q2{
    private MaxHeap maxHeap;

    public Assignment6Q2() {
        maxHeap = new MaxHeap();
    }

    public void add(int value) {
        maxHeap.add(value);
    }

    public int poll() {
        return maxHeap.remove();
    }

    public int peek() {
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        Assignment6Q2 pq = new Assignment6Q2();
        pq.add(30);
        pq.add(50);
        pq.add(40);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
    }
}