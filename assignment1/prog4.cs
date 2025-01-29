using System;

class Program
{
    public static void Main()
    {
        Console.Write("Enter string");
        string input = Console.ReadLine();
       
        string ans = "";

        foreach (char ch in input)
        {
            if (!ans.Contains(ch))
            {
                ans += ch;
            }
        }

        Console.WriteLine("String is " + ans);
    }
}
