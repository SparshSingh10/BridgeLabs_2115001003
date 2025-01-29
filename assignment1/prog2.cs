using System;

class Program
{
    public static void Main()
    {
        Console.Write("Enter");
        string input = Console.ReadLine();

        string reverseString = "";

        for (int i = input.Length - 1; i >= 0; i--)
        {
            reverseString += input[i];
        }

        Console.WriteLine("reverseString String is " + reverseString);
    }
}
