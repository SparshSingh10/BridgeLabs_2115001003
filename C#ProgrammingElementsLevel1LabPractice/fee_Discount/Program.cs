using System;

class Program
{
	public static void Main(string[] args){
		
		Console.Write("Enter the fee:");
        double fee =double.Parse(Console.ReadLine());
		 Console.Write("Enter discount percent (e.g - 10 for 10%)");
        double discountPercent = double.Parse(Console.ReadLine())/100;
		
		double discount=fee*discountPercent ;
		 double price = fee - discount;
		
		Console.WriteLine($"The discount amount is INR {discount} and final discounted fee is INR {price}");
		
	}
}