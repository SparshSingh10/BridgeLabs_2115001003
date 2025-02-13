import java.util.HashSet;

public class TwoSum1 {
    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(target - num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 15, 3, 7 };
        int target = 17;

        if (hasPairWithSum(arr, target)) {
            System.out.println("Pair found!");
        } else {
            System.out.println("No pair found.");
        }
    }
}