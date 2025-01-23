
using System;

class PrimeCheck
{
    static void Main(string[] args)
    {
        int numberN = int.Parse(Console.ReadLine());
        bool isPrime = numberN > 1;
        for (int i = 2;i* i<= numberN && isPrime; i++)
            if (numberN % i == 0)
			isPrime = false;
        Console.WriteLine(isPrime ? "Prime":"Not Prime");
    }
}
