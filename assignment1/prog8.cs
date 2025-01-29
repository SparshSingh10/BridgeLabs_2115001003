using System;

class Program
{
    public static void Main()
    {
        Console.Write("Enter the first string");
        string s1 = Console.ReadLine();

        Console.Write("Enter the second string");
        string s2 = Console.ReadLine();

        int ans = fun(s1, s2);

        if (ans < 0)
            Console.WriteLine("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order.");
        else if (ans > 0)
            Console.WriteLine("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order.");
        else
            Console.WriteLine("The two strings are equal.");
    }

    public static int fun(string s1, string s2)
    {
        int min = Math.Min(s1.Length, s2.Length);

        for (int i = 0; i < min; i++)
        {
            if (s1[i] < s2[i]) return -1;
            if (s1[i] > s2[i]) return 1;
        }

        if (s1.Length < s2.Length) return -1;
        if (s1.Length > s2.Length) return 1;

        return 0;
    }
}
