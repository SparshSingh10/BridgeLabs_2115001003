
using System;
class Program12 {
    static void Main(string[] args) {
        Console.Write("Enter number");
		
        int n=int.Parse(Console.ReadLine());
        if (n>0) {
            int sumFormul = (n*(n+1))/2;
            int loopSum = 0;
            for (int i = 1; i <= n;i++) {
                loopSum +=i;
            }
            Console.WriteLine($"Formula result: {sumFormul}, Loop result: {loopSum}");
			/* sum console here */
        } else 
		{
            Console.WriteLine("Not a natural number");
        }
    }
}

