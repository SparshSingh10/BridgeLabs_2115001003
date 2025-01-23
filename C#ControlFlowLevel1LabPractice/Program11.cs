using System;
class Program11 {
    static void Main(string[] args) {
        double sum = 0;
        while (true) {
            Console.Write("enter a number (0 or negative to stop): ");
            double num = double.Parse(Console.ReadLine());
            if (num <= 0)
				break;
            sum+=num;
        }
        Console.WriteLine($"Total sum: {sum}");
    }
}