using System;

class Program
{
    static void Main(string[] args)
    {
        // Input for Principal here
        Console.WriteLine("Enter Principal Amount");
        double p = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("Enter Rate of Interest");
        double rate = Convert.ToDouble(Console.ReadLine());
        Console.WriteLine("Enter Time");
        double time = Convert.ToDouble(Console.ReadLine());
        double si = CalculateSimpleInterest(p, rate, time);
        Console.WriteLine($"The Simple Interest is {si} for Principal {p}, Rate {rate}%, and Time {time} years.");
    }

    // Function
    static double CalculateSimpleInterest(double p, double r, double t)
    {
        return (p * r * t) / 100;
    }
}