using System;

class Program
{
    public static void Main(string[] args)
    {
        double wp = double.Parse(Console.ReadLine());
        double wk = wp * 2.2;
        Console.WriteLine($"The weight of the person in pounds is {wp} and in kg is {wk}");
    }
}
