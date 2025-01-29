using System;

class Program
{
    public static void Main()
    {
        Console.Write("Enter string");
        string ans = Console.ReadLine();
        string newString = "";

        foreach (char c in ans)
        {
            if (char.IsUpper(c))
                newString += char.ToLower(c);
            else
                newString += char.ToUpper(c);
        }

        Console.WriteLine("new String = " + newString);
    }
}
