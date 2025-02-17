public class Search {
    public static void main(String[] args) {
        int[] sizes = { 1_000_000, 10_000_000, 100_000_000 }; 
                                                             
        int target = 999_999; 

        for (int size : sizes) {
            int[] arr = new int[size];

            for (int j = 0; j < size; j++) {
                arr[j] = j;
            }

            System.out.println("Dataset Size: " + size);

            // Measure Linear Search
            long start = System.nanoTime();
            boolean linearFound = linear(arr, target);
            long end = System.nanoTime();
            System.out.println("  Linear Search - Found: " + linearFound + ", Time: " + formatTime(end - start));

            // Measure Binary Search
            start = System.nanoTime();
            boolean binaryFound = binary(arr, target);
            end = System.nanoTime();
            System.out.println("  Binary Search - Found: " + binaryFound + ", Time: " + formatTime(end - start));
            System.out.println("--------------------------------------------------");
        }
    }

    public static boolean linear(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean binary(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    // Format time for better readability (convert ns to ms if needed)
    public static String formatTime(long nanoseconds) {
        if (nanoseconds >= 1_000_000) {
            return (nanoseconds / 1_000_000.0) + " ms"; // Convert to milliseconds if large
        }
        return nanoseconds + " ns"; // Keep nanoseconds for small values
    }
}
