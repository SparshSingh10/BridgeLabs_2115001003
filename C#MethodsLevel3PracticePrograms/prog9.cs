using System;

class EuclideanDistanceAndLineEquation
{
    public static double FindEuclideanDistance(double x1, double y1, double x2, double y2)
    {
        double distance = Math.Sqrt(Math.Pow(x2 - x1, 2) + Math.Pow(y2 - y1, 2));
        return distance;
    }

    public static double[] FindLineEquation(double x1, double y1, double x2, double y2)
    {
        double[] equation = new double[2];
        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        equation[0] = slope;
        equation[1] = intercept;
        return equation;
    }

    public static void Main(string[] args)
    {
        Console.Write("Enter x1: ");
        double x1 = double.Parse(Console.ReadLine());

        Console.Write("Enter y1: ");
        double y1 = double.Parse(Console.ReadLine());

        Console.Write("Enter x2: ");
        double x2 = double.Parse(Console.ReadLine());

        Console.Write("Enter y2: ");
        double y2 = double.Parse(Console.ReadLine());

        double distance = FindEuclideanDistance(x1, y1, x2, y2);
        Console.WriteLine($"Euclidean distance between the points is: {distance}");

        double[] lineEquation = FindLineEquation(x1, y1, x2, y2);
        Console.WriteLine($"Equation of the line: y = {lineEquation[0]}x + {lineEquation[1]}");
    }
}

