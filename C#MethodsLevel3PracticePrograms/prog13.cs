using System;

class Program
{
    static void Main()
    {
        int[,] m2 = newMatrix(2, 2);
        int[,] m1 = newMatrix(2, 2);

        display(m1);
        display(m2);

        display(add(m1, m2));
        display(sub(m1, m2));

        display(transpose(m1));

        Console.WriteLine(determinant(m1));

        display(inverse(m1));
    }
    static void display(int[,] m)
    {
        for (int i = 0; i < m.GetLength(0); i++)
        {
            for (int j = 0; j < m.GetLength(1); j++)
                Console.Write(m[i, j] + " ");
            Console.WriteLine();
        }
        Console.WriteLine();
    }


    static int[,] newMatrix(int rows, int cols)
    {
        var random = new Random();
        var m = new int[rows, cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                m[i, j] = random.Next(1, 10);
        return m;
    }


    static int[,] add(int[,] m1, int[,] m2)
    {
        int[,] newArray = new int[m1.GetLength(0), m1.GetLength(1)];
        for (int i = 0; i < m1.GetLength(0); i++)
            for (int j = 0; j < m1.GetLength(1); j++)
                newArray[i, j] = m1[i, j] + m2[i, j];
        return newArray;
    }



    static int[,] transpose(int[,] m1)
    {
        int[,] newArray = new int[m1.GetLength(1), m1.GetLength(0)];
        for (int i = 0; i < m1.GetLength(0); i++)
            for (int j = 0; j < m1.GetLength(1); j++)
                newArray[j, i] = m1[i, j];
        return newArray;
    }

    static int determinant(int[,] m1)
    {
        return m1[0, 0] * m1[1, 1] - m1[0, 1] * m1[1, 0];
    }

    static double[,] inverse(int[,] m1)
    {
        double det = determinant(m1);
        if (det == 0) return null;

        double[,] newArray = {
            { m1[1, 1] / det, -m1[0, 1] / det },
            { -m1[1, 0] / det, m1[0, 0] / det }
        };
        return newArray;
    }

    static void display(double[,] m)
    {
        if (m == null)
        {
            Console.WriteLine("No inverse");
            return;
        }
        for (int i = 0; i < m.GetLength(0); i++)
        {
            for (int j = 0; j < m.GetLength(1); j++)
                Console.Write($"{m[i, j]:F2} ");
            Console.WriteLine();
        }
        Console.WriteLine();
    }
    static int[,] sub(int[,] m1, int[,] m2)
    {
        int[,] newArray = new int[m1.GetLength(0), m1.GetLength(1)];
        for (int i = 0; i < m1.GetLength(0); i++)
            for (int j = 0; j < m1.GetLength(1); j++)
                newArray[i, j] = m1[i, j] - m2[i, j];
        return newArray;
    }
}

