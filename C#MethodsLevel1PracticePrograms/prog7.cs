using System;


class Program {
    static void Main(string[] args) {
        Console.WriteLine("Enter number:");
        int n = int.Parse(Console.ReadLine());
        Console.WriteLine($"{sumfun(n)}");
    }
    // sum function here


    static int sumfun(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
