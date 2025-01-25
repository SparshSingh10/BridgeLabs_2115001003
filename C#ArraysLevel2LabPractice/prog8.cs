using System;

class Program
{
    static void Main()
    {
        Console.Write("Enter number of students");
        int numbers = Convert.ToInt32(Console.ReadLine());

        double[] physicsMarks = new double[numbers];
        double[] chemistryMarks = new double[numbers];
        double[] mathsMarks = new double[numbers];
        double[] per = new double[numbers];
        string[] grade = new string[numbers];

        for (int i = 0; i < numbers; i++)
        {
            Console.Write("Enter Physics marks");
            physicsMarks[i] = double.Parse(Console.ReadLine());
            Console.Write("Enter Chemistry marks");
            chemistryMarks[i] = double.Parse(Console.ReadLine());
            Console.Write("Enter Maths marks");
            mathsMarks[i] = double.Parse(Console.ReadLine());

            per[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3;

            if (per[i] >= 90)
                grade[i] = "A";
            else if (per[i] >= 75)
                grade[i] = "B";
            else if (per[i] >= 50)
                grade[i] = "C";
            else
                grade[i] = "D";
        }

        for (int i = 0; i < numbers; i++)
        {
            Console.WriteLine("Physics " + physicsMarks[i] + ", Chemistry " + chemistryMarks[i] +
                              ", Maths " + mathsMarks[i] + ", Percentage " + per[i] +
                              ", Grade " + grade[i]);
        }
    }
}

