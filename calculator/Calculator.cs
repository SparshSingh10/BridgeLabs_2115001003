using System;

class Calculator
{

    public static void Main(string[] args)
    {


        Console.WriteLine("Enter the first number");
        int n1 = int.Parse(Console.ReadLine());
        Console.WriteLine("Enter the second number");
        int n2 = int.Parse(Console.ReadLine());

        Console.WriteLine("Enter the operation");
        switch (Console.ReadLine())
        {
            case "+":
                Add(n1, n2);
                break;
            case "-":
                Substract(n1, n2);
                break;
            case "*":
                Multiply(n1, n2);
                break;
            case "/":
                divide(n1, n2);
                break;
            default:
                Console.WriteLine("Invalid operation");
                break;
        }

    }
    public static void Add(int n1, int n2)
    {
        Console.WriteLine("The sum is " + (n1 + n2));
    }

    public static void Substract(int n1, int n2)
    {
        Console.WriteLine("The difference is " + (n1 - n2));
    }
    public static void Multiply(int n1, int n2)
    {
        Console.WriteLine("The product is " + (n1 * n2));
    }
    public static void divide(int n1, int n2)
    {
        Console.WriteLine("The quotient is " + (n1 / n2));
    }
}