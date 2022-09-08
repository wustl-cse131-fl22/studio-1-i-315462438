package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		int c = a.nextInt();
		
		if(c % 4 ==0 && c % 100 !=0 && c % 400 ==0) {
			System.out.print(a+ "is a leap year: " +" "+ "true" );
		}
		else {
			System.out.print(a+ "is a leap year: " +" "+ "false" );
		}
		
		
		boolean flag = c%4 ==0;
		boolean flag2 = c%100 != 0;
		boolean flag3 = c%400 ==0;
		
		boolean flag4 = flag ==flag2==flag3;
		
		
		
		
		

	}

}
