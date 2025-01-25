using System;

class Program
{
    static void Main()
    {
        Console.Write("Enter a number");
        int n = Convert.ToInt32(Console.ReadLine());
        int[] digit = new int[10];
        int ind = 0;

        while (n > 0)
        {
            digit[ind++] = n % 10;
            n /= 10;
        }

        int largest = 0, SecondLarge = 0;

        for (int i = 0; i < ind; i++)
        {
            if (digit[i] > largest)
            {
                SecondLarge = largest;
                largest = digit[i];
            }
            else if (digit[i] > SecondLarge && digit[i] != largest)
            {
                SecondLarge = digit[i];
            }
        }

        Console.WriteLine("Second Largest" + SecondLarge);
        Console.WriteLine("Largest" + largest);
    }
}

