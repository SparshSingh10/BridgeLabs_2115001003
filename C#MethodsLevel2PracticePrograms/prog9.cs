using System;

class Program
{
    static bool pos(int number) => number >= 0;
    static bool even(int number) => number % 2 == 0;
    static int Compare(int n1, int n2) => n1 == n2 ? 0 : n1 > n2 ? 1 : -1;

    static void Main()
    {
        int[] n = new int[5];
        for (int i = 0; i < n.Length; i++)
        {
            Console.Write($"Enter number {i + 1}: ");
            n[i] = int.Parse(Console.ReadLine());

            Console.WriteLine(pos(n[i]) ? even(n[i]) ? "Positive and Even" : "Positive and Odd" : "Negative");
        }

        Console.WriteLine($"First and last {Compare(n[0], n[^1])}");
    }
}

