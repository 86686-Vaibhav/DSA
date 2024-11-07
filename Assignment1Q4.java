public class Assignment1Q4{
    
    public static int binarySearchDescending(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {20, 17, 15, 13, 10, 8, 5, 3, 1};
        int key = 8;
        
        int result = binarySearchDescending(arr, key);
        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }
    }
}
