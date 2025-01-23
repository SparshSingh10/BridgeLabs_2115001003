using System;
class GreatestFactor
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());
        int gfact=1;
        for (int i=n-1; i> 0;i--)
            if (n %i ==0)
            {
               gfact = i;
                break;
            }
			/* calcuted facor */
        Console.WriteLine($"Greatest Factor: {gfact}");
    }
}
