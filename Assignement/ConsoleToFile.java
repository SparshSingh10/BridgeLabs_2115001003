import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleToFile {
    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fileWriter = new FileWriter("output.txt");

            System.out.println("Enter text (type 'exit' to stop):");

            String input;
            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                fileWriter.write(input + "\n");
            }

            br.close();
            fileWriter.close();

            System.out.println("Input saved to output.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
