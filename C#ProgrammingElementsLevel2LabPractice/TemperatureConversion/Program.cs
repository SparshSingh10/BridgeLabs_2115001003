using System;

class Program
{
    public static void Main(string[] args)
    {
        double c = double.Parse(Console.ReadLine());
        double f = (c* 9 /5) + 32;
        Console.WriteLine($"The {c} Celsius is {f} Fahrenheit");
    }
}
