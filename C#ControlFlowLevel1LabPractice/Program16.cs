using System;
class Program15 {
    static void Main(string[] arg) {
        Console.Write("Enter number here ");
        int n = int.Parse(Console.ReadLine());
        if (n>0) {
            for(int i=1;i<=n;i++) {
                Console.WriteLine($"{i} is {(i%2==0?"even" : "odd")}");
            }
        } else
		{
			/* print natural number */
            Console.WriteLine("Not a natural number");
        }
    }
}