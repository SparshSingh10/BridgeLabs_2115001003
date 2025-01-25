// using System;

// class Program
// {
//     static void Main(string[] args)
//     {
//         Console.Write("Enter the number of r: ");
//         int r = Convert.ToInt32(Console.ReadLine());

//         Console.Write("Enter the number of c: ");
//         int c = Convert.ToInt32(Console.ReadLine());

//         int[,] mat = new int[r, c];

//         for (int i = 0; i < r; i++)
//         {
//             for (int j = 0; j < c; j++)
//             {
//                 mat[i, j] = Convert.ToInt32(Console.ReadLine());
//             }
//         }

//         int[] array = new int[r * c];
//         int ind = 0;

//         for (int i = 0; i < r; i++)
//         {
//             for (int j = 0; j < c; j++)
//             {
//                 array[ind] = mat[i, j];
//                 ind++;
//             }
//         }

//         for (int i = 0; i < array.Length; i++)
//         {
//             Console.Write(array[i] + " ");
//         }
//     }
// }

