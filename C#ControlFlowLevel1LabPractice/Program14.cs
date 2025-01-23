using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("enter a number");
        int n = int.Parse(Console.ReadLine());

        if (n>= 0)
        {
            //using while loop
            int factorial = 1;
            int i = 1;

            while (i<= n)
            {
                factorial*= i;
                i++;
            }
            Console.WriteLine($"Factorial {n}is {factorial}");
        }
        else
        {
            Console.WriteLine("Not factorial");
        }
    }
}
