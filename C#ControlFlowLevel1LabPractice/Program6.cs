using System;
class Program6 {
    static void Main() {
        Console.Write("Enter number");
		
		/* enter a number */
        int number = int.Parse(Console.ReadLine());
        if (number > 0) 
			Console.WriteLine("Positive");
        else if (number < 0) 
			Console.WriteLine("Negative");
		
        else Console.WriteLine("Zero");
    }
}
 