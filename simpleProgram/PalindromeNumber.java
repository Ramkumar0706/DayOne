package simpleProgram;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		boolean b=isPalindrome(n);
		if(b) {
			System.out.println("the user enter number is Palindrome");
		}
		else
			System.out.println("the user enter number is not palindrome");
	}

	private static boolean isPalindrome(int n) {
		
		int temp=n;
		int sum=0;
		while(n!=0) {
			int d=n%10;
			sum=sum*10+d;
			n=n/10;
		}
		return sum==temp;
	}

}
