using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Enter monthes");
        int monthes = int.Parse(Console.ReadLine());
        Console.WriteLine("Enter days");
        int days = int.Parse(Console.ReadLine());
        Console.WriteLine(springfunc(monthes, days) ? "Spring Season" : "Not");
    }


    // function for spring
    static bool springfunc(int monthes, int days)
    {


        return (monthes == 3 && days >= 20) || (monthes == 6 && days <= 20) || (monthes > 3 && monthes < 6);
    }
}
