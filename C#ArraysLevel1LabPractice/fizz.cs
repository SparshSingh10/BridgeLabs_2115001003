using System;

class fizz
{
    static void Main(string[] args)
    {
        Console.Write("Enter positive integer....");
        int n = int.Parse(Console.ReadLine());
        if (n > 0)
        {
            string[] ans = new string[n];
            for (int i = 1; i <= n; i++)
            {
                if (i % 3 == 0 && i % 5 == 0)
                {
                    ans[i - 1] = "FizzBuzz";
                }
                else if (i % 3 == 0)
                {
                    ans[i - 1] = "Fizz";
                }
                else if (i % 5 == 0)
                {
                    ans[i - 1] = "Buzz";
                }
                else
                {
                    ans[i - 1] = i.ToString();
                }
            }
            for (int i = 0; i < ans.Length; i++)
            { Console.WriteLine($"Position {i + 1} = {ans[i]}"); }
        }
        else
        {
            Console.WriteLine("Enter positive integer please ");
        }
    }
}
