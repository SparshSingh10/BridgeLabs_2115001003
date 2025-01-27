using System;

class Program
{
    public static double FahrenheitToCelsius(double fahrenheit) => (fahrenheit - 32) * 5 / 9;
    public static double CelsiusToFahrenheit(double celsius) => (celsius * 9 / 5) + 32;
    public static double PoundsToKilograms(double pounds) => pounds * 0.453592;
    public static double KilogramsToPounds(double kilograms) => kilograms * 2.20462;
    public static double GallonsToLiters(double gallons) => gallons * 3.78541;
    public static double LitersToGallons(double liters) => liters * 0.264172;

    public static void Main()
    {
        Console.WriteLine(FahrenheitToCelsius(100));
        Console.WriteLine(CelsiusToFahrenheit(37.78));
        Console.WriteLine(PoundsToKilograms(150));
        Console.WriteLine(KilogramsToPounds(68));
        Console.WriteLine(GallonsToLiters(10));
        Console.WriteLine(LitersToGallons(25));
    }
}

