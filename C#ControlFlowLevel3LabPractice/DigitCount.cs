using System;
class DigitCount
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine()), count = 0;
        while (n != 0)
        {
            n /= 10;
            count++;
        }
        Console.WriteLine($"Digit Count is {count}");
    }
}
