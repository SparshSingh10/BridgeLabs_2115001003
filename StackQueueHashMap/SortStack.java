import java.util.Stack;

public class SortStack {

    public static void SortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int item = stack.pop();
            SortStack(stack);
            sortedInsert(stack, item);
        }
    }

    public static void sortedInsert(Stack<Integer> stack, int item) {
        if (stack.isEmpty() || stack.peek() <= item) {
            stack.push(item);
            return;
        }
        int n = stack.pop();
        sortedInsert(stack, item);
        stack.push(n);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        System.out.println("Stack before sorting: " + stack);
        SortStack(stack);
        System.out.println("Stack after sorting: " + stack);

    }
}
