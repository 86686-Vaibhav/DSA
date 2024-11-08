
public class Assignment2Q1{
    public static void insertionSortDescending(int[] arr) {
    	
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                
            }
            
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6, 28, 34};
        
        insertionSortDescending(arr);
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}