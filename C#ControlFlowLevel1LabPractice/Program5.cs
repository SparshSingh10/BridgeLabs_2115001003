using System;
class Program5 {
    static void Main(string[] args) {
        Console.Write("Enter age");
		/* age is entered */
        int age = int.Parse(Console.ReadLine());
        Console.WriteLine($"The person's age is {age} and {(age>=18?"can vote":"cannot vote")}.");
    }
}
