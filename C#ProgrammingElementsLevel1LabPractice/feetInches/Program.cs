using System;

class Program
{
    public static void Main(string[] args)
    {
        Console.Write("Height in centimeters");
        double heightInCm = double.Parse(Console.ReadLine());
        double heightInInches = heightInCm / 2.54;
        int feet = (int)(heightInInches / 12);
        int inches = (int)(heightInInches % 12);
        Console.WriteLine($"Height in cm is {heightInCm} in feet is {feet} and inches is {inches}");
    }
}

