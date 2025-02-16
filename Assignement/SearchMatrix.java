import java.util.Scanner;

public class SearchMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt(), mat[][] = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        int t = sc.nextInt(), l = 0, h = r * c - 1;

        while (l <= h) {
            int m = (l + h) / 2, x = m / c, y = m % c;
            if (mat[x][y] == t) {
                System.out.println("true");
                return;
            }
            if (mat[x][y] < t)
                l = m + 1;
            else
                h = m - 1;
        }
        System.out.println("false");
    }
}
