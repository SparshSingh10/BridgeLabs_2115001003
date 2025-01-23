using System;
class Program9 {
    static void Main() {
        Console.Write("enter countdown value");
        int counter = int.Parse(Console.ReadLine());
        for (int i=counter; i> 0;i--) {
            Console.WriteLine(i);
        }
		
        Console.WriteLine("Liftoff!");
		/* liftoff printed */
    }
}