using System;
class Program2 {
    static void Main(string[] args) {
        Console.Write("enter three numbers");
        int num1 = int.Parse(Console.ReadLine());
        int num2= int.Parse(Console.ReadLine());
        int num3 =int.Parse(Console.ReadLine());
        Console.WriteLine($"Is the first number the smallest? {(num1 < num2 && num1 < num3 ? "Yes" : "No")}");
    }
}
