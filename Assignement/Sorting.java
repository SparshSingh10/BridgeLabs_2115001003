import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public static void main(String[] args) {
        int[] sizes = { 1000, 10000, 100000 };
        Random r = new Random();

        for (int size : sizes) {
            int[] data = new int[size];
            for (int i = 0; i < size; i++) {
                data[i] = r.nextInt(size);
            }

            int[] bd = Arrays.copyOf(data, data.length);
            int[] md = Arrays.copyOf(data, data.length);
            int[] qd = Arrays.copyOf(data, data.length);

            long start, time;

            start = System.nanoTime();
            bubbleSort(bd);
            time = System.nanoTime() - start;
            System.out.println("Dataset Size " + size);
            System.out.println("Bubble Sort Time " + time / 1e6 + " ms");

            start = System.nanoTime();
            mergeSort(md, 0, md.length - 1);
            time = System.nanoTime() - start;
            System.out.println("Merge Sort Time " + time / 1e6 + " ms");

            start = System.nanoTime();
            quickSort(qd, 0, qd.length - 1);
            time = System.nanoTime() - start;
            System.out.println("Quick Sort Time " + time / 1e6 + " ms");

        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int[] mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return new int[] { arr[si] }; 
        }
        int mid = (si + ei) / 2;
        int[] first = mergeSort(arr, si, mid);
        int[] second = mergeSort(arr, mid + 1, ei);
        return merge(first, second);
    }

    public static int[] merge(int[] first, int[] second) {
        int m = second.length;
        int n = first.length;
        int i = 0, j = 0, k = 0;
        int[] ans = new int[n + m];

     
        while (i < n && j < m) {
            if (first[i] < second[j]) {
                ans[k++] = first[i++];
            } else {
                ans[k++] = second[j++];
            }
        }

        
        while (i < n) {
            ans[k++] = first[i++];
        }
        while (j < m) {
            ans[k++] = second[j++];
        }
        return ans;
    }

    public static String formatTime(long nanoseconds) {
        return (nanoseconds / 1_000_000.0) + " ms";
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
