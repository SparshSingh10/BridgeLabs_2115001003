using System;

class Program
{
    static void Main()
    {
        Console.Write("Enter a ");

        double a = Convert.ToDouble(Console.ReadLine());
        Console.Write("Enter b ");

        double b = Convert.ToDouble(Console.ReadLine());
        Console.Write("Enter c ");

        double c = Convert.ToDouble(Console.ReadLine());

        roots(a, b, c);
    }

    static void roots(double a, double b, double c)

    {
        double dlta = Math.Pow(b, 2) - 4 * a * c;
       

        if (dlta > 0)
        {
            double root1 = (-b + Math.Sqrt(dlta)) / (2 * a);
           
            double root2 = (-b - Math.Sqrt(dlta)) / (2 * a);

            Console.WriteLine($"Root 1 is  {root1}, Root 2 is {root2}");
        }
        else if (dlta == 0)
        {
            double root = -b / (2 * a);
            Console.WriteLine($"Root {root}");
        }
        else
        {
            Console.WriteLine("No real roots found");
        }
    }
}

