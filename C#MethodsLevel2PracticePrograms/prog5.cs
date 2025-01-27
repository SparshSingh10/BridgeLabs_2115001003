using System;

class Program
{
    public static double YardsToFeet(double yard) => yard * 3;
    public static double FeetToYards(double feet) => feet * 0.333333;
    public static double MetersToInches(double meter) => meter * 39.3701;
    public static double InchesToMeters(double inche) => inche * 0.0254;
    public static double InchesToCentimeters(double inche) => inche * 2.54;

    public static void Main()
    {
        Console.WriteLine(YardsToFeet(5));
        Console.WriteLine(FeetToYards(15));
        Console.WriteLine(MetersToInches(2));
        Console.WriteLine(InchesToMeters(10));
        Console.WriteLine(InchesToCentimeters(8));
    }
}

