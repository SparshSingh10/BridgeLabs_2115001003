using System;

class Program
{
    public static void Main(string[] args)
    {
        string name = Console.ReadLine();
        string start = Console.ReadLine();
        string intermediateCity = Console.ReadLine();
        string destinationCity = Console.ReadLine();
        double distanceFromStartToIntermediate = double.Parse(Console.ReadLine());
        double distanceFromIntermediateToDestination = double.Parse(Console.ReadLine());
        double totalTime = double.Parse(Console.ReadLine());
        Console.WriteLine($"The results of the trip are: {name}, {start} to {intermediateCity}, and {destinationCity}. Time taken: {totalTime} hours.");
    }
}
