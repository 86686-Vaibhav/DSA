public class Assignment1Q7{
    
    public static int findRank(int[] arr, int x) {
        int rank = 0;
        
        for (int num : arr) {
            if (num <= x) {
                rank++;
            }
        }
        
        return rank;
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 3, 4, 4, 1};
        int element = 4;
        
        int rank = findRank(arr, element);
        System.out.println("Rank of " + element + " is: " + rank);
    }
}
