using System;

class Program
{
    public static void Main()
    {
        Console.Write("Enter string");
        string str = Console.ReadLine();

        Console.Write("Enter character");
        char str1 = Console.ReadLine()[0];

        string newSting = str.Replace(str1.ToString(), "");

        Console.WriteLine("Modified String is " + newSting);
    }
}
