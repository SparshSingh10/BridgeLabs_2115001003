import java.util.Scanner;

public class SearchWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        String arr[] = new String[n], word = sc.nextLine();

        for (int i = 0; i < n; i++) arr[i] = sc.nextLine();

        for (String s : arr) {
            if (s.contains(word)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Not Found");
    }
}
