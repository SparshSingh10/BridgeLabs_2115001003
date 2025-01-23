using System;
class FizzBuzzWhile
{
    static void Main(string[] args)
    {
        int n= int.Parse(Console.ReadLine());
        int i =1;
		
		/* using while loop here */
        while (i<= n)
        {
            Console.WriteLine(i%3==0&& i%5 == 0 ?"FizzBuzz" :i %3 == 0 ?"Fizz" :i %5 == 0 ?"Buzz" : i.ToString());
            i++;
        }
    }
}
