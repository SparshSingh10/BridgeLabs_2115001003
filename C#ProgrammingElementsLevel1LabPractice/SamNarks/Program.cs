using System;

class Program
{
    public static void Main(String[] args)
    {
        int maths = 94;
        int physics = 95;
        int chem = 96;

        double marks = (maths + chem + physics) / 3.0;
        Console.WriteLine($"Sam’s average mark in PCM is {marks:F3}");
    }
}
