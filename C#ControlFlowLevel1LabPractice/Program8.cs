using System;
class Program8 {
    static void Main(string[] args) {
        Console.Write("enter a countdown value");
		
		/* enter a countdown value here */
        int counter = int.Parse(Console.ReadLine());
        while (counter > 0) {
            Console.WriteLine(counter);
            counter--;
        }
		
        Console.WriteLine("Liftoff!");
    }
}