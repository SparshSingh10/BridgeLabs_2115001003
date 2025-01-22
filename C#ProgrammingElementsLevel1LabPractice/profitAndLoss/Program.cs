using System;

class Program
{
	public static void Main(String[] args){
		
		int cp=129;
		int sp=191;
		
		int profit=sp-cp;
		double per=((double)profit/cp)*100;
		
		Console.WriteLine($"The Cost Price is INR {cp} and Selling Price is INR {sp}\n"+$"The Profit is INR {profit} and the Profit Percentage is {per:F3}");
}
}
