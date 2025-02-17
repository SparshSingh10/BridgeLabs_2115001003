import java.util.HashSet;
import java.util.TreeSet;

public class DataStructureComparison {
    public static void main(String[] args) {
        int[] sizeData = { 5_000, 500_000, 1_000_000 };
        int searchElement = 500; 

        for (int siz : sizeData) {
            int[] arr = new int[siz];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i = 0; i < siz; i++) {
                arr[i] = i;
                hashSet.add(i);
                treeSet.add(i);
            }
            long start = System.nanoTime();
            arraySearch(arr, searchElement);
            long end = System.nanoTime();
            System.out.println("Array Search (N=" + siz + ") " + (end - start) + " nanoseconds");
            start = System.nanoTime();
            hashSetSearch(hashSet, searchElement);
            end = System.nanoTime();
            System.out.println("HashSet Search (N=" + siz + ") " + (end - start) + " nanoseconds");
            start = System.nanoTime();
            treeSetSearch(treeSet, searchElement);
            end = System.nanoTime();
            System.out.println("TreeSet Search (N=" + siz + ") " + (end - start) + " nanoseconds");

            System.out.println("---------------------------------------------------");
        }
    }

    public static void arraySearch(int[] arr, int element) {
        for (int num : arr) {
            if (num == element) {
                break;
            }
        }
    }
    public static void hashSetSearch(HashSet<Integer> set, int element) {
        set.contains(element);
    }
    public static void treeSetSearch(TreeSet<Integer> set, int element) {
        set.contains(element);
    }
}
