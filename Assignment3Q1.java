import java.util.Stack;

public class Assignment3Q1{
    public static void main(String...args) {
        int[] array = {0, 2, 4, 6, 8, 10};
        Stack<Integer> stack = new Stack<>();

        for (int num : array) {
            stack.push(num);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}






