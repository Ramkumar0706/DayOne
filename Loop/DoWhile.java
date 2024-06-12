package Loop;

import java.util.Scanner;

public class DoWhile {
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();	
		do {
			System.out.print(n--);
		}while(n>=0);
	}

}
