using System;

class Program
{
    static void Main()
    {
        Console.Write("Enter numbers of students");
        int numbers = Convert.ToInt32(Console.ReadLine());
        double[,] mark = new double[numbers, 3];
        string[] grade = new string[numbers];
        double[] per = new double[numbers];

        for (int i = 0; i < numbers; i++)
        {
            Console.Write("Enter Physics marks ");
            mark[i, 0] = double.Parse(Console.ReadLine());
            Console.Write("Enter Chemistry marks");
            mark[i, 1] = double.Parse(Console.ReadLine());
            Console.Write("Enter Maths marks");
            mark[i, 2] = double.Parse(Console.ReadLine());

            per[i] = (mark[i, 0] + mark[i, 1] + mark[i, 2]) / 3;

            if (per[i] >= 90)
                grade[i] = "A";
            else if (per[i] >= 75)
                grade[i] = "B";
            else if (per[i] >= 50)
                grade[i] = "C";
            else grade[i] = "D";
        }

        for (int i = 0; i < numbers; i++)
        {
            Console.WriteLine("Physics" + mark[i, 0] + ", Chemistry" + mark[i, 1] + ", Maths" + mark[i, 2] + ", per" + per[i] + ", Grade" + grade[i]);
        }
    }
}

