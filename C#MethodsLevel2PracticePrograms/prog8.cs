 using System;

class Program
{
    static void Main()
    {
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++)
        {
            Console.Write($"Enter age{i + 1} ");
            age[i] = int.Parse(Console.ReadLine());

            Console.Write($"Enter height {i + 1}");
            height[i] = double.Parse(Console.ReadLine());
        }

        Console.WriteLine($"Youngest is {Array.IndexOf(age, age.Min()) + 1}");
        Console.WriteLine($"Tallest is {Array.IndexOf(height, height.Max()) + 1}");
    }
}

