import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of strings ");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        String[] arr = new String[n];
        System.out.println("Enter the strings");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        
        StringBuffer sb = new StringBuffer();
        
        for (String str : arr) {
            sb.append(str);
        }
        
        System.out.println("Concatenated String: " + sb.toString());
        sc.close();
    }
}
