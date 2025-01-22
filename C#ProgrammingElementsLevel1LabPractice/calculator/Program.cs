using System;

class Program
{
    public static void Main(string[] args)
    {
        double a,b;
        a=double.Parse(Console.ReadLine());
        b=double.Parse(Console.ReadLine());

        double add=a+b;
        double subtract=a-b;
        double multiply=a*b;
        double divide=b!=0?a/b:double.NaN;

        Console.WriteLine($"The addition, subtraction, multiplication and division value of 2 numbers {a} and {b} is {add},{subtract},{multiply},and {divide}");
    }
}
