package jumpStatement;

import java.util.Scanner;

public class BreakStatement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int nextInt = sc.nextInt();
		for(int i=0;i<=nextInt;i++) {
			if(i==nextInt/2)
				break;
			
			System.out.println(i);
		}
	}

}
