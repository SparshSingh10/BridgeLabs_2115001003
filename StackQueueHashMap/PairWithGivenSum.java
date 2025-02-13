import java.util.HashSet;

public class PairWithGivenSum {
    public static boolean sol(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            // Check if the complement exists in the set
            if (set.contains(complement)) {
                return true; // Pair found
            }

            // Add the current number to the set
            set.add(num);
        }

        return false; // No pair found
    }

    public static void main(String[] args) {
        int[] arr = { 10, 15, 3, 7 };
        int target = 17;

        if (sol(arr, target)) {
            System.out.println("Pair with the given sum exists.");
        } else {
            System.out.println("No pair with the given sum found.");
        }
    }
}