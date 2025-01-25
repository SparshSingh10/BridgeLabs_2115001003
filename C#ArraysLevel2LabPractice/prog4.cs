using System;

class Program
{
    static void Main()
    {
        Console.Write("Enter a number");

        // input your number
        int number = int.Parse(Console.ReadLine());
        string rev = "";

        while (number > 0)
        {
            rev += (number % 10).ToString();
            number /= 10;
        }

        Console.WriteLine("rev Number" + rev);
    }
}

