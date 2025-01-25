// using System;

// class arraySum
// {
//     static void Main(string[] args)
//     {
//         int ind = 0;
//         double[] n = new double[10];
//         double total = 0.0;

//         // Taking is taken here
//         while (true)
//         {

//             Console.Write("Enter your number");
//             double num = double.Parse(Console.ReadLine());

//             if (num <= 0 || ind == 10)
//             {
//                 break;
//             }

//             n[ind] = num;

//             ind++;
//         }

//         // Sum
//         for (int i = 0; i < ind; i++)
//             total += n[i];

//         Console.WriteLine("Total sum of n is" + total);
//     }
// }
