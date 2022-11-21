package Methods;

import java.util.Scanner;

public class smallestAmong {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the FIRST NUMBER");
		double x=in.nextDouble();
		System.out.println("Enter the SECOND NUMBER");
		double y=in.nextDouble();
		System.out.println("Enter the THIRD NUMBER");
		double z=in.nextDouble();
		System.out.println("The smallest Number is "+smallest(x,y,z)+"\n");
	}
	public static double smallest(double x,double y,double z) {
		return Math.min(Math.min(x, y),z);
		
	}

}
