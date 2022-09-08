package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean isOrder = true;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		if(x<y && y<z)
			isOrder = true;
		else if(x>y && y>z)
			isOrder = true;
		else
			isOrder = false;
		
		boolean flag = x<y;
		boolean flag2 = y<z;
		boolean flag3 = x<z;
		
		boolean oreder = flag == flag2;
		boolean order2 = flag2 == flag3;
		
		boolean order3 = oreder == order2;
		
		

	}

}
