using System;

class Program
{
    public static void Main(string[] args)
    {
        double p;
        p=double.Parse(Console.ReadLine());

        double side=p/ 4;

        Console.WriteLine($"The length is {side} , perimeter is {p}");
    }
}
