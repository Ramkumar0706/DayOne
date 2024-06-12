package ConditionalStatement;

import java.util.Scanner;

public class IfElseControlStatement {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Any number ");
		int n = sc.nextInt();
		if(n>=0) 
			System.out.println("the user enter number "+n+" postive number");
		else
			System.out.println("the user entered number is"+n+" negative number");
	}

}
