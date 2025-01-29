using System;

class ans
{
    public static void Main()
    {
        Console.Write("Enter a string");
        string str = Console.ReadLine();

        string[] words = str.Split(' ');
        string ans = "";

        foreach (string word in words)
        {
            if (word.Length > ans.Length)
            {
                ans = word;
            }
        }


        Console.WriteLine("longest word = " + ans);
    }
}
