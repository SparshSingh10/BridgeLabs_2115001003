using System;

class Program
{
    static void Main()
    {
        Console.Write("Enter a number");
        int number = Convert.ToInt32(Console.ReadLine());
        int[] freq = new int[10];

        while (number > 0)
        {
            freq[number % 10]++;
            number /= 10;
        }

        for (int i = 0; i < 10; i++)
        {
            if (freq[i] > 0)
                Console.WriteLine("Digit " + i + " " + freq[i]);
        }
    }
}

