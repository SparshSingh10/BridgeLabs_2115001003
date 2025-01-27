using System;
class CalendarProgram
{
    public static string GetMonth(int month)
    {
        string[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }
    public static void display(int month, int year)
    {
        string monthName = GetMonth(month);


        int daysInMonth = dayMonth(month, year);


        int firstDay = firstDayMonth(month, year);

        Console.WriteLine($"{monthName} {year}");


        Console.WriteLine("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < firstDay; i++)

        {
            Console.Write("    ");

        }
        for (int day = 1; day <= daysInMonth; day++)
        {
            Console.Write($"{day,3} ");

            if ((firstDay + day) % 7 == 0)
            {

                Console.WriteLine();
            }

        }
        Console.WriteLine();
    }


    public static int dayMonth(int month, int year)
    {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (month == 2 && IsLeapYear(year))
        {

            return 29;
       
        }

        return daysInMonth[month - 1];
    }



    public static int firstDayMonth(int month, int year)
    {
        int year1 = year - (14 - month) / 12;
        int x = year1 + year1 / 4 - year1 / 100 + year1 / 400;
        int month1 = month + 12 * ((14 - month) / 12) - 2;
        int date1 = (1 + x + 31 * month1 / 12) % 7;
        return date1;
    }

    public static bool IsLeapYear(int year)
    {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            return true;
        }
        return false;
    }

    public static void Main(string[] args)
    {
        Console.Write("Enter month");
        int month = int.Parse(Console.ReadLine());
        Console.Write("Enter year ");
        int year = int.Parse(Console.ReadLine());
        display(month, year);
       
    }
}

