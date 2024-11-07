import java.util.HashMap;

public class Assignment1Q6{
    
    public static int findFirstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        for (int num : arr) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
        int result = findFirstNonRepeating(arr);
        
        System.out.println("The first non-repeating element is: " + result);
    }
}

