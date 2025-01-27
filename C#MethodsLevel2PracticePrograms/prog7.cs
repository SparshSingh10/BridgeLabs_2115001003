 using System;

class StudentVoteChecker
{
    public static bool vote(int age)
    {
        if (age < 0) return false;
        return age >= 18;
    }

    static void Main()
    {
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++)
        {
            Console.Write($"Enter age{i + 1} ");
            ages[i] = int.Parse(Console.ReadLine());
            Console.WriteLine(vote(ages[i]) ? "Can vote" : "Cannot");
        }
    }
}

