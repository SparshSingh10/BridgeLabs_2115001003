using System;

class Program
{
    public static void Main(string[] args)
    {
        int n1 = int.Parse(Console.ReadLine());
        int n2 = int.Parse(Console.ReadLine());
        int temp = n1;
        n1 = n2;
        n2 = temp;
        Console.WriteLine($"The swapped numbers are {n1} and {n2}");
    }
}
