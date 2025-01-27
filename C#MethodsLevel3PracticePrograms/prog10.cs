using System;

class Program
{


    public static void Main(string[] args)
    {
        Console.Write("Enter x1");
        double x1 = double.Parse(Console.ReadLine());

        Console.Write("Enter y1 ");
        double y1 = double.Parse(Console.ReadLine());

        Console.Write("Enter x2 ");

        double x2 = double.Parse(Console.ReadLine());

        Console.Write("Enter y2 ");

        double y2 = double.Parse(Console.ReadLine());

        double dis = FindEuclideanDistance(x1, y1, x2, y2);
        Console.WriteLine($"Euclidean dis between the points is {dis}");

        double[] lineEquation = FindLineEquation(x1, y1, x2, y2);
        Console.WriteLine($"eq of y = {lineEquation[0]}x + {lineEquation[1]}");
    }
    public static double FindEuclideanDistance(double x1, double y1, double x2, double y2)
    {
        double dis = Math.Sqrt(Math.Pow(x2 - x1, 2) + Math.Pow(y2 - y1, 2));
        return dis;
    }

    public static double[] FindLineEquation(double x1, double y1, double x2, double y2)
    {
        double[] eq = new double[2];
        double slop1 = (y2 - y1) / (x2 - x1);
        double intercept1 = y1 - slop1 * x1;
        eq[0] = slop1;
        eq[1] = intercept1;
        return eq;
    }

}

