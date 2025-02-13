// package Lec46;

import java.util.Stack;

public class Stock_Span {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = { 3, 6, 1, 4, 18, 7, 5, 11 };
        CalSpan(arr);

    }

    public static void CalSpan(int[] arr) {

        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        System.out.println("Original stack");
        for (int var : arr)
            System.out.print(var + "\t");
        System.out.println("\nstock span");
        for (int var : ans)
            System.out.print(var + "\t");
    }

}