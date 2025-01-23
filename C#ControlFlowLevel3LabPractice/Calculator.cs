using System;
class Calculator
{
    static void Main(string[] args)
    {
        double first1= double.Parse(Console.ReadLine());
        double second =double.Parse(Console.ReadLine());
        string o =Console.ReadLine();
        switch (o)
        {
            case "+":
                Console.WriteLine(first1 + second);
                break;
            case "-":
                Console.WriteLine(first1- second);
                break;
            case "*":
                Console.WriteLine(first1 *second);
                break;
            case "/":
                Console.WriteLine(second !=0 ?first1 /second:"Division by zero");
                break;
            default:
                Console.WriteLine("Invalid Operator");
                break;
        }
    }
}
