using System;

class Program
{
    public static void Main()
    {
        Console.Write("Enter string  here");
        string input = Console.ReadLine();
       
        string reversed = "";
        for (int i = input.Length - 1; i >= 0; i--)
        {
            reversed += input[i];
        }
        Console.WriteLine(input == reversed ? "Palindrome" : "Not");
    }
}
