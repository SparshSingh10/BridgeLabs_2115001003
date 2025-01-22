using System;

class Program
{
    public static void Main(string[] args)
    {
        int noChoco = int.Parse(Console.ReadLine());
        int noChild = int.Parse(Console.ReadLine());

        int perChild = noChoco / noChild;
        int remChil = noChoco % noChild;
        Console.WriteLine($"The number of chocolates each child gets is {perChild} and the number of remaining chocolates is {remChil}");
    }
}
