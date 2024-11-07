public class Assignment1Q1{
    public static int findLastOccurrence(int[] arr, int key) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 2, 5, 2};
        int key = 2;
        int result = findLastOccurrence(arr, key);
        
        if (result != -1) {
            System.out.println("Last occurrence of " + key + " is at index: " + result);
        } else {
            System.out.println("Key " + key + " not found in the array.");
        }
    }
}
