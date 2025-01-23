using System;
class Program17 {
    static void Main(string [] args) {
        Console.Write("enter number");
		
		/* enter your number here */
        int n = int.Parse(Console.ReadLine());
        for (int i=6;i<=9;i++) {
            Console.WriteLine($"{n}*{i} = {n * i}");
        }
    }