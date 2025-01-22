using System;

class Program
{
    public static void Main(string[] args)
    {
        int n1=int.Parse(Console.ReadLine());
        int n2 = int.Parse(Console.ReadLine());
        int q = n1/n2;
        int rm= n1%n2;

        Console.WriteLine($"The Quotient is {q} and Remainder is {rm} of two numbers {n1} and {n2}");
    }
}
