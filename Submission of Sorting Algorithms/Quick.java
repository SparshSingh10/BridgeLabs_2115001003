public class Quick {

    public static void main(String[] args) {
        int[] arr = { 5, 7, 2, 3, 8, 9, 1, 4 };
        quick(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quick(int[] arr, int start, int end) {

        if (start < end) {
            int pivot = partition(arr, start, end);

            quick(arr, start, pivot - 1);
            quick(arr, pivot + 1, end);
        }

    }

    public static int partition(int[] arr, int start, int end) {
        int idx = start - 1;
        int pivot = arr[end];

        for (int j = start; j < end; j++) {

            if (arr[j] <= pivot) {
                idx++;
                swap(arr, j, idx);

            }
        }
        idx++;
        swap(arr, end, idx);
        return idx;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
