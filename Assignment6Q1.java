import java.util.ArrayList;
import java.util.List;

class MinHeap {
    private List<Integer> heap;

    public MinHeap() {
        heap = new ArrayList<>();
    }

    public void add(int value) {
        heap.add(value);
        int index = heap.size() - 1;
        
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index) >= heap.get(parent)) break;
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

    private void heapify(int index) {
        int smallest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < heap.size() && heap.get(left) < heap.get(smallest)) smallest = left;
        if (right < heap.size() && heap.get(right) < heap.get(smallest)) smallest = right;
       
        if (smallest != index) {
            swap(index, smallest);
            heapify(smallest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }
}

public class Assignment6Q1{
    public static void heapSort(int[] arr) {
        MinHeap minHeap = new MinHeap();
        for (int value : arr) minHeap.add(value);
        for (int i = 0; i < arr.length; i++) arr[i] = minHeap.remove();
    }

    public static void main(String[] args) {
        int[] arr = {12, 9, 13, 45, 8, 7};
        heapSort(arr);
        for (int value : arr) System.out.print(value + " ");
    }
}
