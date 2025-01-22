using System;

class Program
{
    public static void Main(string[] args)
    {
        double b, h;
        b = double.Parse(Console.ReadLine());
        h = double.Parse(Console.ReadLine());
        double ai = 0.5 * b * h;
        double ac = ai * 6.4516;
        Console.WriteLine($"Triangle is {ai} square inches & {ac} square centimeters");
    }
}
