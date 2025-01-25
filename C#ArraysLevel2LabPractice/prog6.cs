using System;

class Program
{
    static void Main()
    {
        Console.Write("Enter number of persons: ");
        int n = int.Parse(Console.ReadLine());

        double[] height = new double[n];
        double[] weights = new double[n];
        double[] bmis = new double[n];
        string[] status = new string[n];

        for (int i = 0; i < n; i++)
        {

            Console.Write("Enter weight" + (i + 1) + ": ");
            weights[i] = double.Parse(Console.ReadLine());

            Console.Write("Enter height" + (i + 1) + ": ");
            height[i] = double.Parse(Console.ReadLine());

            bmis[i] = weights[i] / (height[i] * height[i]);

            if (bmis[i] < 18.5)
                status[i] = "Underweight";
            else if (bmis[i] < 25)
                status[i] = "Normal";
            else if (bmis[i] < 40)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        for (int i = 0; i < n; i++)
        {
            Console.WriteLine($"Person {i + 1}: Height is {height[i]}, Weight is {weights[i]}, BMI is {bmis[i]}, Status is {status[i]}");
        }
    }
}

