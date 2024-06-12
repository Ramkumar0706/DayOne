package simpleProgram;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
		System.out.println("the reverse number of "+n);
		while(n!=0) {
			int d=n%10;
			sum=sum*10+d;
			n=n/10;
		}
		System.out.println(sum);
		
	}
}
