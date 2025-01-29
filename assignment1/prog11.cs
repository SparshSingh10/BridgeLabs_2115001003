using System;

class Program
{
    public static void Main()
    {
        Console.Write("first string");
        string str1 = Console.ReadLine().Replace(" ", "").ToLower();

        Console.Write("second string");
        string str2 = Console.ReadLine().Replace(" ", "").ToLower();

        bool ans = anagramCheck(str1, str2);


        if (ans)
            Console.WriteLine("anagrams");
        else
            Console.WriteLine("not anagrams");
    }

    public static bool anagramCheck(string str1, string str2)
    {
        if (str1.Length != str2.Length)
            return false;

        char[] array1 = str1.ToCharArray();
        char[] array2 = str2.ToCharArray();

        Array.Sort(array1);
        // sorting the array
        Array.Sort(array2);

        return new string(array1) == new string(array2);
    }
}
