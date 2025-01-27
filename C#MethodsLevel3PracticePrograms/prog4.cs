using System;

class NumberCheckerPalindrome
{
    public static void Main(string[] args)
    {
        string number = Console.ReadLine();
        int[] digits = StoreDigitsInArray(int.Parse(number));
        Console.WriteLine("Reverse digits: " + string.Join(",", ReverseDigits(digits)));
        Console.WriteLine("Palindrome: " + IsPalindrome(digits));
    }
    static int[] StoreDigitsInArray(int number)
    {
        string numStr = number.ToString();
        int[] digits = new int[numStr.Length];
        for (int i = 0; i < numStr.Length; i++)
        {
            digits[i] = int.Parse(numStr[i].ToString());
        }
        return digits;
    }

    static int[] ReverseDigits(int[] digits)
    {
        Array.Reverse(digits);
        return digits;
    }

    static bool IsPalindrome(int[] digits)
    {
        int[] reversedDigits = ReverseDigits((int[])digits.Clone());
        for (int i = 0; i < digits.Length; i++)
        {
            if (digits[i] != reversedDigits[i])
                return false;
        }
        return true;
    }
}

