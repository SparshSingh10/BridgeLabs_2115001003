using System;
using System.Reflection.Metadata.Ecma335;

class Program {
    static void Main(string[] args) {
        Console.WriteLine("Enter three numbers:");
        int n1 = int.Parse(Console.ReadLine());

        int n2 = int.Parse(Console.ReadLine());

        int n3 = int.Parse(Console.ReadLine());

        int[] ans = FindSmallestAndLargest(n1, n2, n3);
        Console.WriteLine($"Smallest is {ans[0]}, Largest is {ans[1]}");
    }

// Function to finf largetst and smallest
    static int[] FindSmallestAndLargest(int n1, int n2, int n3) {
        int smallest = Math.Min(n1, Math.Min(n2, n3));


        int largest = Math.Max(n1, Math.Max(n2, n3));
        return new int[] { smallest, largest };
    }
}

