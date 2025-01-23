
using System;

class LeapYear1
{
    static void Main(string[] args)
    {
        int myYear = int.Parse(Console.ReadLine());
		/* enter leap year */
        if (myYear >= 1582)
        {
            if (myYear % 4 == 0 && (myYear % 100 != 0 || myYear % 400 == 0))
                Console.WriteLine("Leap Year");
            else
                Console.WriteLine("Not a Leap Year");
        }
        else
            Console.WriteLine("Invalid Year");
    }
}
