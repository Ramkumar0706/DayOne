package jumpStatement;

import java.util.Scanner;

public class ContinueStatement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if(i%2!=0) {
				continue;
			}
			else
				System.out.println(i);
			
			
		}
	}

}
