using System;

class Program
{
    static void Main()
    {
        int[] numb = Generate4DigitRandomArray(5);
        double[] ans = FindAverageMinMax(numb);
       
        Console.WriteLine($"Average {ans[0]}");
        Console.WriteLine($"Min{ans[1]}");
        Console.WriteLine($"Max {ans[2]}");
    }

    static int[] Generate4DigitRandomArray(int size)
    {
        Random rand = new Random();


        int[] n = new int[size];
       
        for (int i = 0; i < size; i++)
        {

            n[i] = rand.Next(1000, 10000);

        }

        return n;
    }


    static double[] FindAverageMinMax(int[] n)
    {
        double sum = 0;

        int min = n[0];

        int max = n[0];


        foreach (int num in n)
        {
            sum += num;

            min = Math.Min(min, num);

            max = Math.Max(max, num);
        }

        double average = sum / n.Length;

        return new double[] { average, min, max };
    }
}
