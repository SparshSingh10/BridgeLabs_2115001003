using System;

class NumberChecker
{
    public static void Main(string[] args)
    {
        string n = Console.ReadLine();
       
        Console.WriteLine("Prime number: " + prime(int.Parse(n)));

        Console.WriteLine("Neon number: " + neo(int.Parse(n)));

        Console.WriteLine("Spy number: " + spy(int.Parse(n)));

        Console.WriteLine("Automorphic number: " + Automorphic(int.Parse(n)));


        Console.WriteLine("Buzz number: " + buzz(int.Parse(n)));

    }


    static bool prime(int n)
    {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.Sqrt(n); i++)

        {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    static bool buzz(int n)
    {
        return n % 7 == 0 || n.ToString().EndsWith("7");


    }

    static bool neo(int n)
    {
        int sq = n * n;
        int sum = 0;
        while (sq > 0)
        {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == n;
    }

    static bool Automorphic(int n)
    {
        int sq = n * n;
        return sq.ToString().EndsWith(n.ToString());
    }

    static bool spy(int n)
    {
        int sum = 0, prod = 1;
        while (n > 0)
        {
            int digit = n % 10;
            sum += digit;
            prod *= digit;
            n /= 10;
        }
        return sum == prod;
    }
}

