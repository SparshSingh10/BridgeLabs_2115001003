import java.io.*;

public class FileReadExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("example.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();
    }
}
