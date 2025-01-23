using System;
class Program16 {
    static void Main(string[] args) {
        Console.Write("Enter salary");
        double salry = double.Parse(Console.ReadLine());
        Console.Write("enter years of service");
        int yr = int.Parse(Console.ReadLine());
        if (yr > 5) {
            double bonus = salry * 0.05;
            Console.WriteLine($"Bonus amount: {bonus}");
        } else {
            Console.WriteLine("No bonus");
        }
   