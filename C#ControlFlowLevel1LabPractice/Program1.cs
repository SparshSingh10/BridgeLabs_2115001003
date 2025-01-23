using System;
class Program1 {
    static void Main(string[] args) {
        Console.Write("Enter a number");
        int number1 = int.Parse(Console.ReadLine());
        Console.WriteLine($"Is the number {number1} divisible by 5? {(number1 % 5 == 0 ? "Yes" : "No")}");
    }
}
