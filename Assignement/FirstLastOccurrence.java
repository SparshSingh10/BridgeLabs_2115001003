
public class FirstLastOccurrence {

    public static int findFirst(int[] arr, int t) {
        int l = 0, r = arr.length - 1, f = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == t) {
                f = m;
                r = m - 1;
            } else if (arr[m] < t) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return f;
    }

    public static int findLast(int[] arr, int t) {
        int l = 0, r = arr.length - 1, lst = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == t) {
                lst = m;
                l = m + 1;
            } else if (arr[m] < t) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return lst;
    }

    public static int[] findFirstLast(int[] arr, int t) {
        return new int[] { findFirst(arr, t), findLast(arr, t) };
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 4, 4, 6, 7, 9, 9, 9, 10 };
        int t = 4;
        int[] res = findFirstLast(arr, t);
        System.out.println("First is " + res[0]);
        System.out.println("Last is " + res[1]);
    }
}
