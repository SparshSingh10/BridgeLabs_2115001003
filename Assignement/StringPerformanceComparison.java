public class StringPerformanceComparison {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        String text = "hello";

        long startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        long endTime = System.nanoTime();
        long bufferTime = endTime - startTime;
        System.out.println("Time taken by StringBuffer: " + bufferTime / 1_000_000 + " ms");

        startTime = System.nanoTime();
        StringBuilder sbd = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbd.append(text);
        }
        endTime = System.nanoTime();
        long builderTime = endTime - startTime;
        System.out.println("Time taken by StringBuilder: " + builderTime / 1_000_000 + " ms");
    }
}
