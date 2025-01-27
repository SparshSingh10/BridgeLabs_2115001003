using System;

class Program
{
    static void Main()
    {
   Console.Write("Enter a year: ");
        int year = int.Parse(Console.ReadLine());
        if (year < 1582)
        {
      Console.WriteLine("Invalid year");
            return;
        }
        Console.WriteLine(isLeap(year) ? "Leap Year" : "Not");
    }

    static bool isLeap(int year) =>
        (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}