public class Assignment1Q5{
    
    public static int findNthOccurrence(int[] arr, int element, int n) {
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
                if (count == n) {
                    return i;
                }
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5, 2};
        int element = 2;
        int n = 4;
        
        int result = findNthOccurrence(arr, element, n);
        if (result != -1) {
            System.out.println("The " + n + "rd occurrence of " + element + " is at index: " + result);
        } else {
            System.out.println("The " + n + "rd occurrence of " + element + " is not found in the array.");
        }
    }
}