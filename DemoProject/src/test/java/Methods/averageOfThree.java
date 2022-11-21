package Methods;

import java.util.Scanner;

public class averageOfThree {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number");
		Double x=in.nextDouble();
		System.out.println("Enter Number");
		Double y=in.nextDouble();
		System.out.println("Enter Number");
		Double z=in.nextDouble();
		System.out.println("Average Is"+average(x, y, z));
	}
public static double average(double x,double y,double z) {
	
	
	double average=(x+y+z)/3;
	return average;
	
}
		
}
