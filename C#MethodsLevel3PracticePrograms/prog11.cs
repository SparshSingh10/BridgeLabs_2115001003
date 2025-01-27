//    Create a program to find the bonus of 10 employees based on their
//    years of service as well as the total bonus
//     amount the 10-year-old company Zara has to pay as a bonus,
//     along with the old and new salary.


using System;
class Program
{
    static void Main()
    {
        int[,] employee = EmployeeData(10);
        double[,] Salaries_Bonuses = funcSalariesBonuses(employee);
        display(employee, Salaries_Bonuses);
    }

    static int[,] EmployeeData(int Employees)
    {
        Random random = new Random();
        int[,] data = new int[Employees, 2];
        for (int i = 0; i < Employees; i++)
        {
            data[i, 0] = random.Next(30000, 99999);
            data[i, 1] = random.Next(1, 11);
        }
        return data;
    }

    static double[,] funcSalariesBonuses(int[,] employee)
    {
        int r = employee.GetLength(0);
        double[,] updated = new double[r, 2];
        for (int i = 0; i < r; i++)
        {
            int old_Salary = employee[i, 0];
            int years = employee[i, 1];
            double bonusPercentage = years > 5 ? 0.05 : 0.02;
            double bonus = old_Salary * bonusPercentage;
            double newSalary = old_Salary + bonus;
            updated[i, 0] = newSalary;
            updated[i, 1] = bonus;
        }
        return updated;
    }

    static void display(int[,] oldData, double[,] newData)
    {
        double OldSalary = 0;
        double New_Salary = 0;
        double Bonus = 0;
        Console.WriteLine("Emp#\tOld Salary\tYears of Service\tBonus\t\tNew Salary");
        for (int i = 0; i < oldData.GetLength(0); i++)
        {
            int old_Salary = oldData[i, 0];
            int years = oldData[i, 1];
            double bonus = newData[i, 1];
            double newSalary = newData[i, 0];
            OldSalary += old_Salary;
            New_Salary += newSalary;
            Bonus += bonus;
            Console.WriteLine($"{i + 1}\t{old_Salary}\t\t{years}\t\t\t{bonus:F2}\t\t{newSalary:F2}");
        }
        Console.WriteLine("\nSummary is = ");

        Console.WriteLine($"Old Salary {OldSalary:F2}");
        Console.WriteLine($"New Salary {New_Salary:F2}");
        Console.WriteLine($"Bonus Amount {Bonus:F2}");
    }
}

