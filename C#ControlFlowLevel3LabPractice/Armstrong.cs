using System;
class Armstrong
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());
		
		/* enter you armystrong number */
        int o = n, sum = 0;
        while (o != 0)
        {
            int r = o % 10;
            sum += r * r * r;
            o /= 10;
        }
        Console.WriteLine(sum == n ? "Armstrong Number" : "Not an Armstrong Number");
    }
}
