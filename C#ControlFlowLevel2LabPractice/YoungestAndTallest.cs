using System;
class YoungestAndTallest
{
    static void Main(string[] args)
    {
        int first = int.Parse(Console.ReadLine());
        int second= int.Parse(Console.ReadLine());
        int third =int.Parse(Console.ReadLine());
        double h1= double.Parse(Console.ReadLine());
        double h2 =double.Parse(Console.ReadLine());
        double h3= double.Parse(Console.ReadLine());
		
		/* calculating max */
        int youngest =Math.Min(first, Math.Min(second, third));
        double tallest= Math.Max(h1, Math.Max(h2, h3));
        Console.WriteLine($"Youngest is {youngest}, Tallest is {tallest}");
    }
}
