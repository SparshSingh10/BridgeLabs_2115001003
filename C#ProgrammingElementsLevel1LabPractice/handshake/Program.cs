using System;

class Program
{
    public static void Main(string[] args)
    {
        int n;
        n=int.Parse(Console.ReadLine());
        int hs=(n*(n-1))/2;
        Console.WriteLine($"The maximum number of possible handshakes among {n} students is {hs}");
    }
}
