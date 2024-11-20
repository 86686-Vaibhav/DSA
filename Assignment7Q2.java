import java.util.HashMap;

public class Assignment7Q2{
    public static int calculateMode(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxCount = 0;
        int mode = array[0];

        for (int num : array) {
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);
            if (count > maxCount) {
                maxCount = count;
                mode = num;
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 2, 8, 4, 1, 3, 8};
        System.out.println("Mode: " + calculateMode(array));
    }
}