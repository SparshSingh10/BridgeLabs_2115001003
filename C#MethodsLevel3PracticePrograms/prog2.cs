using System;

class NumberChecker
{
    public static void Main(string[] args)
    {
        string number = Console.ReadLine();
        int[] digArray = digitArray(int.Parse(number));
        Console.WriteLine("Largest digit is " + Largest(digArray));
        Console.WriteLine("Digit count is" + DigitCount(int.Parse(number)));
        Console.WriteLine("Duck number is  " + duckCheack(digArray));
        Console.WriteLine("Smallest digit is" + Smallest(digArray));
        Console.WriteLine("Armstrong number is " + IsArmstrong(digArray));
    }


    static int[] digitArray(int number)
    {
        string numStr = number.ToString();
        int[] digArray = new int[numStr.Length];
        for (int i = 0; i < numStr.Length; i++)
        {
            digArray[i] = int.Parse(numStr[i].ToString());
        }
        return digArray;
    }
    static int DigitCount(int number)
    {
        return number.ToString().Length;
    }

    static bool IsArmstrong(int[] digArray)
    {
        int sum = 0;
        int number = int.Parse(string.Join("", digArray));
        int length = digArray.Length;
        foreach (int digit in digArray)
        {
            sum += (int)Math.Pow(digit, length);
        }
        return sum == number;
    }

    static bool duckCheack(int[] digArray)
    {
        foreach (int digit in digArray)
        {
            if (digit != 0)
                return true;
        }
        return false;
    }
    static int Smallest(int[] digArray)
    {
        int smallest = Int32.MaxValue;
        foreach (int digit in digArray)
        {
            if (digit < smallest)
                smallest = digit;
        }
        return smallest;
    }

    static int Largest(int[] digArray)
    {
        int largest = Int32.MinValue;
        foreach (int digit in digArray)
        {
            if (digit > largest)
                largest = digit;
        }
        return largest;
    }
}

