package simpleProgram;

import java.util.Scanner;

public class CountDigitNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int temp=n;
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		System.out.println("the count of the "+temp+" is "+count);
		
	}

}
