using System;

class Program {
    static void Main(string[] args) {
        Console.WriteLine("Enter side A");
        double a = double.Parse(Console.ReadLine());
        Console.WriteLine("side B of triangle");
        double b = double.Parse(Console.ReadLine());
        Console.WriteLine("side C of triangle");
        double c = double.Parse(Console.ReadLine());

        // function called to calculate perimmeter
        Console.WriteLine($"Rounds needed {CalculateRounds(a, b, c)}");
    }    static int CalculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int) Math.Ceiling(5000 / perimeter);
    }
}

