using System;

class Program
{
    public static double MileToKm(double mile) => mile * 1.60934;
    public static double FeetToMeters(double feet) => feet * 0.3048;
    public static double KmToMile(double km) => km * 0.621371;
    public static double MetersToFeet(double meter) => meter * 3.28084;

    public static void Main()
    {
        Console.WriteLine(MileToKm(5));
        Console.WriteLine(FeetToMeters(10));
        Console.WriteLine(KmToMile(8));
        Console.WriteLine(MetersToFeet(20));
    }
}

