using System;

class FootballTeamHeights
{
    public static void Main(string[] args)
    {
        int[] heigt = random();
        Console.WriteLine("Shortest Height" + shortHeight(heigt));

        Console.WriteLine("tallestBoy Height " + tall(heigt));


        Console.WriteLine("Mean Height " + FindMeanHeight(heigt));
    }
    // Random function
    static int[] random()
    {
        Random random = new Random();
        int[] heigt = new int[11];
        for (int i = 0; i < heigt.Length; i++)
        {
            heigt[i] = random.Next(150, 251);
        }
        return heigt;
    }
    // short height
    static int shortHeight(int[] heigt)
    {
        int shortest = heigt[0];
        foreach (int height in heigt)
        {
            if (height < shortest)
                shortest = height;
        }
        return shortest;
    }

    static int tall(int[] heigt)
    {
        int tallestBoy = heigt[0];
        foreach (int height in heigt)
        {
            if (height > tallestBoy)
                tallestBoy = height;
        }
        return tallestBoy;
    }

    static double FindMeanHeight(int[] heigt)
    {
        int sum = 0;
        foreach (int height in heigt)
        {
            sum += height;
        }
        return sum / (double)heigt.Length;
    }
}

