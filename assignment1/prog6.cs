using System;

class Program
{
    public static void Main()
    {
        Console.Write("Enter a string");
        string input = Console.ReadLine();

        Console.Write("Enter a substring");
        string substring = Console.ReadLine();

        int c1 = 0;
        int ind = 0;

        while ((ind = input.IndexOf(substring, ind)) != -1)
        {
            c1++;
            ind += substring.Length;
        }

        Console.WriteLine(c1 + " times");
    }
}
