using System;
class Program
{
    public static void Main()
    {
        Console.Write("Enter a string");
        string str = Console.ReadLine();

        int max = 0;
        char freq = ' ';

        foreach (char c in str)
        {
            int count = 0;
            foreach (char ch in str)
            {
                if (c == ch)
                {
                    count++;
                }
            }

            if (count > max)
            {
                max = count;
                freq = c;
            }
        }

        Console.WriteLine("Frequent Character is" + freq);
    }
}
