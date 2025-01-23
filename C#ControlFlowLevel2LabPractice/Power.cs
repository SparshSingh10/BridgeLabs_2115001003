using System;
class Power
{
    static void Main(string[] args)
    {
        int n= int.Parse(Console.ReadLine());
        int p =int.Parse(Console.ReadLine());
        int r= 1;
        for (int i =1;i<= p;i++)
            r*= n;
		
		/* power calculated */
        Console.WriteLine($"Power is {r}");
    }
}
