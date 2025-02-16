import java.util.Scanner;

public class RotationPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int l = 0, r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] > arr[r])
                l = m + 1;
            else
                r = m;
        }
        System.out.println(l);
    }
}
