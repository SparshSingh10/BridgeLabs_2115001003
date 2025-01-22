using System;

class Program
{
    public static void Main(string[] args)
    {
        double uP, qauant;
        uP = double.Parse(Console.ReadLine());
        qauant = double.Parse(Console.ReadLine());
        double tp = uP * qauant;
        Console.WriteLine($"The total purchase price is INR {tp} if the quantity is {qauant} and unit price is INR {uP}");
    }
}
