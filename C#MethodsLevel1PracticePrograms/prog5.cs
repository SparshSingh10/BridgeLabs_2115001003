using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter");
        int n = int.Parse(Console.ReadLine());
        Console.WriteLine($"Result {CheckNumber(n)}");
    }

    static int CheckNumber(int n)
    {
        if (n > 0)
            return 1;
        if (n < 0)
            return -1;
        return 0;
    }
}

