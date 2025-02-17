public class fibo {
    public static void main(String[] args) {
        // Measure time for Fibonacci using Recursion
        double start = System.nanoTime();
        fiboRec(10);
        double end = System.nanoTime();
        System.out.println("Recursion time: " + (end - start) + " nanoseconds");

        // Measure time for Fibonacci using Iteration
        start = System.nanoTime();
        fiboIter(10);
        end = System.nanoTime();
        System.out.println("Iterative time: " + (end - start) + " nanoseconds");
    }

    public static int fiboRec(int n) {
        if (n <= 1)
            return n;
        return fiboRec(n - 1) + fiboRec(n - 2);
    }

    public static int fiboIter(int n) {
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
