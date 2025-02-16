import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String targetWord = "Java"; 
        int count = 0;

        FileReader fileReader = new FileReader("example.txt");
        BufferedReader br = new BufferedReader(fileReader);

        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+"); 
            for (String word : words) {
                if (word.equalsIgnoreCase(targetWord)) {
                    count++;
                }
            }
        }

        br.close();

        System.out.println("The word '" + targetWord + "' appears " + count + " times.");
    }
}
