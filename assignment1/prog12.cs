using System;

class Program
{
    public static void Main()
    {
        Console.Write("enter sentence");
        string sen = Console.ReadLine();

        Console.Write("input old word");
        string oldword = Console.ReadLine();

        Console.Write("input new word ");

        string newword = Console.ReadLine();

        string newSent = changeWord(sen, oldword, newword);


        Console.WriteLine("Modified sentence is" + newSent);
    }

    public static string changeWord(string sen, string oldword, string newword)
    {
        return sen.Replace(oldword, newword);
    }
}
