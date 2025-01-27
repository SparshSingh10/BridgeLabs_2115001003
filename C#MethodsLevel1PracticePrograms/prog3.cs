using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter number of students");
        int n = int.Parse(Console.ReadLine());
        Console.WriteLine($"Maximum handshakes{CalculateHandshakes(n)}");
    }
    // function is here
    static int CalculateHandshakes(int n)
    {
        return (n * (n - 1)) / 2;
    }
}

