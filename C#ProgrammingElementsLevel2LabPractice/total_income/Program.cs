using System;
class Program
{
    public static void Main(string[] args)
    {
        double s = double.Parse(Console.ReadLine());
        double bonus = double.Parse(Console.ReadLine());
        double ti =s+ bonus;
        Console.WriteLine($"The salary is INR {s} and bonus is INR {bonus}. Hence Total Income is INR {ti}");
    }
}
