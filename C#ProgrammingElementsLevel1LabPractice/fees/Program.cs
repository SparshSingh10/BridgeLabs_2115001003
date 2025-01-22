using System;

class Program
{
	public static void Main(string[] args){
		int fee=125000;
		double discountPercent =.1;
		
		double discount=fee*discountPercent ;
		double price=(double)fee-discount;
		
		Console.WriteLine($"The discount amount is INR {discount} and final discounted fee is INR {price}");
		
	}
}