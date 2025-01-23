
using System;

class FizzBuzzFor
{
    static void Main(string[] args)
    {
        int n = int.Parse(Console.ReadLine());
		
		/* inpt your number */
        for (int i =1;i<=n;i++)
            Console.WriteLine(i%3==0 && i%5==0?"FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 ==0?"Buzz": i.ToString());
    }
}
