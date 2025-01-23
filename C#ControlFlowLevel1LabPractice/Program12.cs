using System;

class Program
{
    static void Main(string[] args)
    {
        Console.Write("Enter number");
        int n=int.Parse(Console.ReadLine());

        if (n>0)
        {
            int formulaSum = n*(n+1)/2;
            int loopSum=0;
            int i=1;
            while (i<=n)
            {
                loopSum+=i;
                i++;
            }

            Console.WriteLine($"Formula result {formulaSum}, Loop result- {loopSum}");

            if (formulaSum == loopSum)
                Console.WriteLine("results match!");
        }
        else
        {
            Console.WriteLine("Not natural number.");
        }
    }
}