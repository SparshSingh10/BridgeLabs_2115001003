import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Compare {
    public static void main(String[] args) {
        sbVsSbf();
        frVsIsr();
    }

    static void sbVsSbf() {
        String txt = "hello";
        int n = 1_000_000;

        long t1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            sb.append(txt);
        long t2 = System.nanoTime();
        System.out.println("SB: " + (t2 - t1) / 1_000_000 + " ms");

        long t3 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++)
            sbf.append(txt);
        long t4 = System.nanoTime();
        System.out.println("SBF: " + (t4 - t3) / 1_000_000 + " ms");
    }

    static void frVsIsr() {
        String path = "largefile.txt";

        long t1 = System.nanoTime();
        int w1 = countFR(path);
        long t2 = System.nanoTime();
        System.out.println("FR Words: " + w1);
        System.out.println("FR: " + (t2 - t1) / 1_000_000 + " ms");

        long t3 = System.nanoTime();
        int w2 = countISR(path);
        long t4 = System.nanoTime();
        System.out.println("ISR Words: " + w2);
        System.out.println("ISR: " + (t4 - t3) / 1_000_000 + " ms");
    }

    static int countFR(String path) {
        int count = 0;
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null)
            count += line.split("\\s+").length;
        br.close();
        return count;
    }

    static int countISR(String path) {
        int count = 0;
        FileInputStream fis = new FileInputStream(path);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null)
            count += line.split("\\s+").length;
        br.close();
        return count;
    }
}
