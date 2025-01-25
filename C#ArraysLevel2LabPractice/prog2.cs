
using System;

class Program
{
    static void Main()
    {
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++)
        {
            Console.Write("Enter your height: ");
            height[i] = double.Parse(Console.ReadLine());

            Console.Write("Enter your age");
            age[i] = int.Parse(Console.ReadLine());

        }

        int young = 0;
        double tall = 0;

        // finding tallest
        for (int i = 0; i < 3; i++)
        {

            if (age[i] < age[young])
                young = i;
            if (height[i] > tall)
                tall = height[i];
        }
        // prinitng tallest and youngest
        Console.WriteLine("tall Height is" + tall);
        Console.WriteLine("young Age is" + age[young]);
    }
}

