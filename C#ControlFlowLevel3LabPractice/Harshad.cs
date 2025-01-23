using System;
class Harshad
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine()), dummy = n, sum = 0;
        while (dummy != 0)
        {
            sum += dummy % 10;
            dummy /= 10;
        }
        Console.WriteLine(n % sum == 0 ? "Harshad Number" : "Not a Harshad Number");
    }
}
