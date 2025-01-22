using System;
class Program
{
    public static void Main(string[] args)
    {
        double f = double.Parse(Console.ReadLine());
        double c = (f -32)*5/9;
        Console.WriteLine($"The {f} Fahrenheit is {c} Celsius");
    }
}
