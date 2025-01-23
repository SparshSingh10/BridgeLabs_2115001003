using System;
class Program10 {
    static void Main(string[] args) {
        double sum=0;
        while (true) {
            Console.Write("enter number  & (0 to stop): ");
            double num = double.Parse(Console.ReadLine());
			
			/* number readed */
            if (num == 0) 
				break;
            sum+= num;
        }
        Console.WriteLine($"Total sum: {sum}");
    }
}