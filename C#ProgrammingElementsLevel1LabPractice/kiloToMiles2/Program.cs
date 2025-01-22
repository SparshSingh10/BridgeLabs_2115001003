
using System;

class Program{
	
	public static void Main(String[] args){
		
		double kilo=double.Parse(Console.ReadLine());
		
		double mile=kilo/1.6;
		
		Console.WriteLine($"The distance {kilo} km in miles is {mile}");
		
	}
}H