import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        bubble(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void bubble(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}