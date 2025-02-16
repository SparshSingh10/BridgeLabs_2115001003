
public class SearchChallenge {

    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1)
                return i + 1;
        }
        return n + 1;
    }

    public static int binarySearch(int[] arr, int t) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == t)
                return m;
            if (arr[m] < t)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, -1, 1 };
        System.out.println(firstMissingPositive(arr));

        int[] sortedArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;
        System.out.println(binarySearch(sortedArr, target));
    }
}
