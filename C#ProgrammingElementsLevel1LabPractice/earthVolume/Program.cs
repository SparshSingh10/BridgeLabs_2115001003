using System;

class Program
{
	public static void Main(string[] args){
		int r=6378;
		double miles=r/1.6;
		
		double kvolume=(4.0/3)*Math.PI*Math.Pow(r,3);
		double mvolume=(4.0/3)*Math.PI*Math.Pow(miles,3);
		
		Console.WriteLine($"The volume of earth in cubic kilometers is {kvolume} and cubic miles is {mvolume}");
	}
}