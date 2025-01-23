using System;
class Program7 {
    static void Main(string[] args) {
        Console.Write("Enter month");
		
		/* enter the month */
        int month = int.Parse(Console.ReadLine());
        Console.Write("Enter day");
		
        int day = int.Parse(Console.ReadLine());
        if ((month ==3&&day >= 20)|| (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            Console.WriteLine("It's a Spring Season");
        } else {
            Console.WriteLine("Not a Spring Season");
        }
    }
}
 