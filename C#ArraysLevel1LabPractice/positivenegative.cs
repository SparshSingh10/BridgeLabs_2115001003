// using System;

// class PositiveNegative
// {
//     static void Main(string[] args)
//     {
//         int[] n = new int[5];

//         // Input for n
//         for (int i = 0; i < n.Length; i++)
//         {
//             Console.Write("Enter number " + (i + 1) + ": ");
//             n[i] = int.Parse(Console.ReadLine());

//             if (n[i] > 0)
//             {
//                 Console.WriteLine("positive.");

//                 if (n[i] % 2 == 0)
//                 {
//                     Console.WriteLine(n[i] + " is even.");
//                 }
//                 else
//                 {
//                     Console.WriteLine(n[i] + " is odd.");
//                 }
//             }
//             else if (n[i] < 0)
//             {
//                 Console.WriteLine(n[i] + " is negative.");
//             }
//             else
//             {
//                 Console.WriteLine("zero.");
//             }
//         }

//         if (n[0] == n[4])
//         {
//             Console.WriteLine("First and last are equal.");
//         }
//         else if (n[0] > n[4])
//         {
//             Console.WriteLine("First element is greater than last.");
//         }
//         else
//         {
//             Console.WriteLine("Last element is greater than first.");
//         }
//     }
// }
