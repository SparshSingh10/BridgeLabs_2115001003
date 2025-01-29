using System;
class Program
{

    public static void Main(string[] args)
    {

        int c1 = 0;
        int c2 = 0;
        Console.WriteLine("Enter");

        String str = Console.ReadLine();
        for (int i = 0; i < str.Length; i++)
        {
            char ch = str[i];
            if (char.IsLetter(ch))
            {
                if ("aeiou".IndexOf(ch) != -1)
                {
                    c1++;
                }
                else
                {
                    c2++;
                }
            }

        }

        Console.WriteLine("Vowels: " + c1);
        Console.WriteLine("Consonants: " + c2);
    }

}
