using System;
class Abundant
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine()), sum = 0;
		
		/* enter you number */
        for (int i =1;i<n;i++)
            if (n%i==0)
                sum+= i;
        Console.WriteLine(sum > n ? "abundant Number" : "Not abundant Number");
    }
}
