using System;

class NumberChecker
{
    public static int[] FindFactors(int n)
    {
        int count = 0;
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public static int greatestFactor(int n)
    {
        int[] factors = FindFactors(n);
        return factors[factors.Length - 1];
    }

    public static int sumOfFactors(int n)
    {
        int[] factors = FindFactors(n);
        int sum = 0;
        foreach (int factor in factors)
        {
            sum += factor;
        }
        return sum;
    }

    public static int productOf(int n)
    {
        int[] factors = FindFactors(n);
        int product = 1;
        foreach (int factor in factors)
        {
            product *= factor;
        }
        return product;
    }

    public static double FindProduct(int n)
    {
        int[] factors = FindFactors(n);
        double product = 1;
        foreach (int factor in factors)
        {
            product *= Math.Pow(factor, 3);
        }
        return product;
    }

    public static bool IsPerfect(int n)
    {
        int sum = sumOfFactors(n) - n;
        return sum == n;
    }

    public static bool abundantNumber(int n)
    {
        int sum = sumOfFactors(n) - n;
        return sum > n;
    }

    public static bool IsDeficient(int n)
    {
        int sum = sumOfFactors(n) - n;
        return sum < n;
    }

    public static bool strong(int n)
    {
        int temp = n;
        int sumFact = 0;
        while (temp > 0)
        {
            int digit = temp % 10;
            sumFact += Factorial(digit);
            temp /= 10;
        }
        return sumFact == n;
    }

    private static int Factorial(int n)
    {
        int fact = 1;
        for (int i = 1; i <= n; i++)
        {
            fact *= i;
        }
        return fact;
    }

    public static void Main()
    {
        int n = 28;
        int[] factors = FindFactors(n);
        Console.Write("Factors of " + n + " are  printed here ");
        foreach (int factor in factors)
        {
            Console.Write(factor + " ");
        }
        Console.WriteLine();

        Console.WriteLine("Greatest factor of " + n + "is" + greatestFactor(n));
        Console.WriteLine("Sum of factors IsPerfect" + sumOfFactors(n));
        Console.WriteLine("Product of factors are " + productOf(n));
        Console.WriteLine("Product of cubes of factors are " + FindProduct(n));
        Console.WriteLine(n + " is a perfect number= " + IsPerfect(n));
        Console.WriteLine(n + " is an abundant number= " + abundantNumber(n));
        Console.WriteLine(n + " is a deficient number= " + IsDeficient(n));
        Console.WriteLine(n + " is a strong number= " + strong(n));
    }
}

