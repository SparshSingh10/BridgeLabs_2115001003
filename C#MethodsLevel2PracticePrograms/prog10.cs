using System;

class Program
{
   
    static void input(double[,] pd)
    {
        for (int i = 0; i < 10; i++)
        {
            Console.WriteLine($"Person {i + 1}");
            Console.Write("Weight");
            pd[i, 0] = Convert.ToDouble(Console.ReadLine());
            Console.Write("Height");
            pd[i, 1] = Convert.ToDouble(Console.ReadLine());
        }
    }
   
static void status(double[,] pd, string[] bs)
    {
        for (int i = 0; i < 10; i++)
        {
            double bmi = pd[i, 2];
            if (bmi <= 18.4) bs[i] = "Underweight";
            else if (bmi <= 24.9) bs[i] = "Normal";
            else if (bmi <= 39.9) bs[i] = "Overweight";
            else bs[i] = "Obese";
        }
    }

    static void bmi(double[,] pd)
    {
        for (int i = 0; i < 10; i++)
        {
            double h = pd[i, 1] / 100;
            pd[i, 2] = pd[i, 0] / (h * h);
        }
    }

   
    static void display(double[,] pd, string[] bs)
    {
        Console.WriteLine("\nReport is below");
        Console.WriteLine("P | W | H | BMI | Status");

        for (int i = 0; i < 10; i++)
        {
            Console.WriteLine($"{i + 1} | {pd[i, 0]} | {pd[i, 1]} | {pd[i, 2]:0.00} | {bs[i]}");
        }
    }
     static void Main(string[] args)
    {
        string[] bs = new string[10];
        double[,] pd = new double[10, 3];

        input(pd);
        bmi(pd);
        status(pd, bs);
        display(pd, bs);
    }

}

