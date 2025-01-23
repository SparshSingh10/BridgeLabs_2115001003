
using System;

class MarksGrade
{
    static void Main(string[] args)
    {
        int p = int.Parse(Console.ReadLine());
        int c = int.Parse(Console.ReadLine());
        int m = int.Parse(Console.ReadLine());
        int avg=(p+c+m)/3;
		
		/* average marks here */.
        string g=avg >= 90?"A":avg>=75?"B":avg >=50?"C":"F";
        Console.WriteLine($"Average = {avg},Grade ={g}");
    }
}
