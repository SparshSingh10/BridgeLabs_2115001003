using System;

class NumberCheckerSumAndHarshad
{
    public static void Main(string[] args)
    {
        string n = Console.ReadLine();
        int[] digits = digArray(int.Parse(n));
        Console.WriteLine("Sum of digits: " + digitSum(digits));
        Console.WriteLine("Sum of squares of digits: " + SumOfSquares(digits));
        Console.WriteLine("Harshad number: " + IsHarshad(digits));
    }

    static int[] digArray(int n)
    {
        string nString = n.ToString();
        int[] digits = new int[nString.Length];
        for (int i = 0; i < nString.Length; i++)
        {
            digits[i] = int.Parse(nString[i].ToString());
        }
        return digits;
    }

    static int digitSum(int[] digits)
    {
        int sum = 0;
        foreach (int digit in digits)
        {
            sum += digit;
        }
        return sum;
    }
    // sum of square
    static double SumOfSquares(int[] digits)
    {
        double sum = 0;
        foreach (int digit in digits)
        {
            sum += Math.Pow(digit, 2);
        }
        return sum;
    }



    // harsshad number
    static bool IsHarshad(int[] digits)
    {
        int sum = digitSum(digits);
        int n = int.Parse(string.Join("", digits));
        return n % sum == 0;
    }
}

