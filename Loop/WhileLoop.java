package Loop;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		while(n>0) {
			if(n%2==0)
				System.out.println(n);
			n--;
		}
		
	}

}
