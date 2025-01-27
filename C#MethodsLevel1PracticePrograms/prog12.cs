using System;

class Program {
    static void Main(string[] args) {
        Console.WriteLine("Enter angle");
        double angle = double.Parse(Console.ReadLine());
        double[] results = CalculateTrigonometricFunctions(angle);
        Console.WriteLine($"Sine {results[0]:F4},Cosine: {results[1]:F4}, Tangent: {results[2]:F4}");
    }

    static double[] CalculateTrigonometricFunctions(double angle) {
        double radian= Math.PI * angle / 180.0;
        return new double[] { Math.Sin(radian), Math.Cos(radian), Math.Tan(radian) };
    }
}

