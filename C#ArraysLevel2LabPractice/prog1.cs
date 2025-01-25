using System;

class Program
{
    static void Main()
    {
        double[] employeSalary = new double[10];


        double[] employeYearsOfService = new double[10];
        double[] employeBonus = new double[10];
        double[] employeNewSalary = new double[10];
        double employeTotalBonus = 0, employeTotalOldSalary = 0, employeTotalNewSalary = 0;

        for (int i = 0; i < 10; i++)
        {
            Console.Write("Enter old salary ");
            employeSalary[i] = Convert.ToDouble(Console.ReadLine());
            Console.Write("Enter the years of service");
            employeYearsOfService[i] = Convert.ToDouble(Console.ReadLine());
        }

        for (int i = 0; i < 10; i++)
        {
            if (employeYearsOfService[i] > 5)
                employeBonus[i] = employeSalary[i] * 0.05;
            else
                employeBonus[i] = employeSalary[i] * 0.02;
            employeNewSalary[i] = employeSalary[i] + employeBonus[i];
            employeTotalBonus += employeBonus[i];

            employeTotalOldSalary += employeSalary[i];
            employeTotalNewSalary += employeNewSalary[i];
        }

        Console.WriteLine("Total Bonus is" + employeTotalBonus);

        Console.WriteLine("Total Old Salary is" + employeTotalOldSalary);
        Console.WriteLine("Total New Salary is" + employeTotalNewSalary);
    }
}

