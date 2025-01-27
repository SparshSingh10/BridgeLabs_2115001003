using System;

class Program
{
    static void Main()
    {
        Console.Write("Enter the number of studnts");
        int studentCount = int.Parse(Console.ReadLine());
        int[,] marks = score(studentCount);
        double[,] ans = result(marks);
        display(marks, ans);
    }

    // Display
    static void display(int[,] marks, double[,] ans)

    {
        Console.WriteLine("Student\tPhysics\tChemistry\tMaths\tTotal\tPercentage\tGrade");
        for (int i = 0; i < marks.GetLength(0); i++)
        {
            Console.WriteLine($"{i + 1}\t{marks[i, 0]}\t{marks[i, 1]}\t\t{marks[i, 2]}\t{ans[i, 0]}\t{ans[i, 1]:F2}%\t\t{(char)ans[i, 2]}");
        }
    }
    static char AssignGrade(double perc)
    {
        if (perc >= 80) return 'A';
        if (perc >= 70) return 'B';
        if (perc >= 60) return 'C';
        if (perc >= 50) return 'D';
        if (perc >= 40) return 'E';
        return 'R';
    }
    static double[,] result(int[,] marks)
    {
        int studnts = marks.GetLength(0);
        double[,] ans = new double[studnts, 3];
        for (int i = 0; i < studnts; i++)
        {
            int sum = marks[i, 0] + marks[i, 1] + marks[i, 2];
            double perc = (sum / 300.0) * 100;
            char grade = AssignGrade(perc);

            ans[i, 0] = sum;
            ans[i, 1] = Math.Round(perc, 2);
            ans[i, 2] = grade;
        }
        return ans;
    }

   
    static int[,] score(int studnts)
    {
        Random random = new Random();
        int[,] marks = new int[studnts, 3];
        for (int i = 0; i < studnts; i++)
        {
            marks[i, 0] = random.Next(40, 100);
            marks[i, 1] = random.Next(40, 100);
            marks[i, 2] = random.Next(40, 100);
        }

        return marks;
    }
}

