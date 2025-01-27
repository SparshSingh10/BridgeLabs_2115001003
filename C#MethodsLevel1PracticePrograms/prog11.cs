using System;

class Program {
    static void Main(string[] args) {
        Console.WriteLine("Enter temperature");
        double temperature = double.Parse(Console.ReadLine());
        Console.WriteLine("wind speed");
        double wind = double.Parse(Console.ReadLine());
       
        Console.WriteLine($"Wind Chill: is{CalculateWindChill(temperature, wind):F2}");
    }

    static double CalculateWindChill(double temperature, double wind) {
        return 35.74+0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.Pow(wind, 0.16);
    }
}

