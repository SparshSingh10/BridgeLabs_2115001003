using System;
class MultiplesBelow100
{
    static void Main(string[] args)
    {
        int numb=int.Parse(Console.ReadLine());
        for (int i=100;i>0;i--)
            if (i%numb==0)
                Console.WriteLine(i);
    }
}
