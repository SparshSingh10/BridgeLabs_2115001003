// using System;

// class VoteBase
// {
//     static void Main(string[] args)
//     {
//         int[] age = new int[10];

//         // input for age
//         for (int i = 0; i < age.Length; i++)
//         {
//             Console.Write("Enter the age of student " + (i + 1) + ": ");
//             age[i] = int.Parse(Console.ReadLine());

//             // voting eligibility cheack
//             if (age[i] < 0)
//             {
//                 Console.WriteLine("Invalid age");
//             }
//             else if (age[i] >= 18)
//             {
//                 Console.WriteLine("The student with the age " + age[i] + " can vote.");
//             }
//             else
//             {
//                 Console.WriteLine("The student with the age " + age[i] + " cannot vote.");
//             }
//         }
//     }
// }
