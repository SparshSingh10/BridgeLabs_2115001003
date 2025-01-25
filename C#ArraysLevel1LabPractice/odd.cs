// using System;

// class Odd
// {
//     static void Main(string[] args)
//     {
//         Console.Write("Enter a number: ");


//         int n = Convert.ToInt32(Console.ReadLine());

//         if (n < 1)
//         {
//             Console.WriteLine("Error");
//             return;
//         }

//         int[] even = new int[n / 2 + 1];
//         int[] oddss = new int[n / 2 + 1];
//         int oddIndex = 0, evenIndex = 0;



//         for (int i = 1; i <= n; i++)
//         {
//             if (i % 2 == 0)
//             {
//                 even[evenIndex++] = i;
//             }
//             else
//             {
//                 oddss[oddIndex++] = i;
//             }
//         }

//         // even numbers
//         Console.WriteLine("Even numbers");
//         for (int i = 0; i < evenIndex; i++)
//         {
//             Console.Write(even[i] + " ");
//         }
//         // odd numbers
//         Console.WriteLine("Odd numbers ");
//         for (int i = 0; i < oddIndex; i++)
//         {
//             Console.Write(oddss[i] + " ");
//         }
//         Console.WriteLine();

//     }
// }
