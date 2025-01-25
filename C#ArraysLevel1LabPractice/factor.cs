// using System;

// class factor
// {
//     static void Main(string[] args)
//     {
//         Console.Write("Enter your number");
//         int n = Convert.ToInt32(Console.ReadLine());

//         int ind = 0;
//         int max = 10;
//         int[] fact = new int[10];
//         for (int i = 1; i <= n; i++)
//         {
//             if (n % i == 0)
//             {
//                 if (ind == max)
//                 {
//                     max *= 2;
//                     int[] temp = new int[max];
//                     Array.Copy(fact, temp, fact.Length);
//                     fact = temp;
//                 }

//                 fact[ind] = i;
//                 ind++;
//             }
//         }

//         Console.WriteLine($"Factors of {n} are - ");
//         for (int i = 0; i < ind; i++)
//         {
//             Console.Write(fact[i] + " ");
//         }
//     }
// }
