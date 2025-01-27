using System;

class Program {
    static void Main(string[] args) {
        Console.WriteLine("Enter number of chocolate are ");
        int chocolate = int.Parse(Console.ReadLine());
        Console.WriteLine("Enter number of child here");

        int child = int.Parse(Console.ReadLine());

        int[] result = find(chocolate, child);

        Console.WriteLine($"Each child gets is {result[0]}, Remaining chocolate is{result[1]}");
    }

    static int[] find(int chocolate, int child) {
        return new int[] { chocolate / child, chocolate % child };
    }
}

