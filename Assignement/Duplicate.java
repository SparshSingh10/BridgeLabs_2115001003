import java.util.HashSet;
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string");
        String input = sc.nextLine();
        sc.close();

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }

        System.out.println("String after removing duplicates: " + sb.toString());
    }
}
