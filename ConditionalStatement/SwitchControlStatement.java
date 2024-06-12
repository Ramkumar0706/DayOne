package ConditionalStatement;

import java.util.Scanner;

public class SwitchControlStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Any number");
		int n=sc.nextInt();
		switch(n) {
		case 0 :
			System.out.println("the number "+n);
			break;

		case 1:
			System.out.println("the number "+n);
			break;
		default:
			System.out.println("the user enter number not 0 or 1 the number is "+n);
		}
	}

}
