import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        sb.append(str);
        sb.reverse();
        System.out.println(sb.toString());

    }

}