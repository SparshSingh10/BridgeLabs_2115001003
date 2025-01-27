using System;

class Program
{
    static void Main()
    {
        Console.Write("Enter natural number");
        int n = int.Parse(Console.ReadLine());
        if (n <= 0)
        {
           Console.WriteLine("Invalid input!");
       return;
        }
        int sumRecursive = recuFun(n);
        int Formulasum = n * (n + 1) / 2;

        Console.WriteLine($"Sum Recursive {sumRecursive}");
        Console.WriteLine($"Sum Formula {Formulasum}");
    }

    static int recuFun(int n) => n == 1 ? 1 : n + recuFun(n - 1);
}

