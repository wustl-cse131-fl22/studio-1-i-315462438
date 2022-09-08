package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		
		double c = (a+b)/2.0;
		
		System.out.print("average of" +" "+ a +" "+ "and" +" "+ b+ " "+ "is" +" "+ c);

	}

}
