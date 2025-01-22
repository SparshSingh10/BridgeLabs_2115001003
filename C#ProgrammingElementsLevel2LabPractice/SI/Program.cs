using System;

class Program
{
    public static void Main(string[] args)
    {
        double p = double.Parse(Console.ReadLine());
        double r = double.Parse(Console.ReadLine());
        double t = double.Parse(Console.ReadLine());
        double si = (p * r * t) / 100;
        Console.WriteLine($"The Simple Interest is {si} for Principal {p}, Rate of Interest {r}, and Time {t}");
    }
}
