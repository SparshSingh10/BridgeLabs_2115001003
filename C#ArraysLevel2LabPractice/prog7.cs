using System;

class Program
{
    static void Main()
    {
        Console.Write("Enter number of persons ");
        int n = int.Parse(Console.ReadLine());

        // input jagged array  
        double[][] table = new double[n][];
        string[] weight = new string[n];

        for (int i = 0; i < n; i++)
        {

            table[i] = new double[3];

            Console.Write("Enter height");
            table[i][0] = double.Parse(Console.ReadLine());

            Console.Write("Enter weight");
            table[i][1] = double.Parse(Console.ReadLine());

            table[i][2] = table[i][1] / (table[i][0] * table[i][0]);

            if (table[i][2] < 18.5)
                weight[i] = "Underweight";
            else if (table[i][2] < 25)
                weight[i] = "Normal";
            else if (table[i][2] < 40)
                weight[i] = "Overweight";
            else
                weight[i] = "Obese";
        }

        // Output here
        for (int i = 0; i < n; i++)
        {
            Console.WriteLine("Height is " + table[i][0] + ", Weight is " + table[i][1] +
                              ", BMI is " + table[i][2] + ", Status is " + weight[i]);
        }
    }
}

