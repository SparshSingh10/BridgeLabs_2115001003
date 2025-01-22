using System;

class Program
{
    static void Main()
    {
        double feet = Convert.ToDouble(Console.ReadLine());

        double yards = feet / 3.0;
        double miles = feet / (3.0 * 1760.0);

        double cm = Convert.ToDouble(Console.ReadLine());

        double inches = cm / 2.54;
        int heightFeet = (int)(inches / 12);
        double heightInches = inches % 12;

        Console.WriteLine($"Your Height in cm is {cm} while in feet is {heightFeet} and inches is {heightInches:F2}");
    }
}
