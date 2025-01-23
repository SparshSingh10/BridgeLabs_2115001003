using System;
class Program14 {
    static void Main(string [] args) {
        Console.Write("Enter a number");
        int n=int.Parse(Console.ReadLine());
        if (n>= 0) {
            int fact =1;
            for (int i =1;i <= n; i++) {
                fact*= i;
            }
			
			
			/* calcuate factorial */
            Console.WriteLine($"Factorial of {n} is {fact}");
        } else {
            Console.WriteLine("Not a natural number");
        }
    }
}