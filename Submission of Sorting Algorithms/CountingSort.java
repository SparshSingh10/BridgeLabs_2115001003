import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] ages = { 15, 18, 12, 10, 17, 15, 14, 12 }; 
        countingSort(ages);
        System.out.println("Student Ages are " + Arrays.toString(ages));
    }

    public static void countingSort(int[] arr) {
        int maxAge = 18;
        int minAge = 10;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - minAge]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int age = arr[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--;
        }
        System.arraycopy(output, 0, arr, 0, arr.length);
    }
}
