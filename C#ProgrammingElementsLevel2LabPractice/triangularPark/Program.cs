using System;

class Program
{
    public static void Main(string[] args)
    {
        double s1 = double.Parse(Console.ReadLine());
        double s2 = double.Parse(Console.ReadLine());
        double s3 = double.Parse(Console.ReadLine());
        double perimeter = s1 + s2 + s3;
        double distance = 5000; 
        double rounds = distance / perimeter;
        Console.WriteLine($"The total number of rounds the athlete will run is {rounds} to complete 5 km");
    }
}
