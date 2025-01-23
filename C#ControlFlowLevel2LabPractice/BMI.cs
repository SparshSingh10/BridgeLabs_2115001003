using System;
class BMI
{
    static void Main(string[] args)
    {
        double w = double.Parse(Console.ReadLine());
        double h = double.Parse(Console.ReadLine())/ 100;
        double bmi=w/(h *h);
        Console.WriteLine($"BMI is {bmi}");
    }
}
