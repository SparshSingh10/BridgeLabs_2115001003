
using System;

class LeapYear2
{
    static void Main(string[] args)
    {
        int y=int.Parse(Console.ReadLine());
		
		/* using logical and here */
        Console.WriteLine(y >= 1582 && (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0)) ? "Leap Year" : "Not a Leap Year");
    }
}
