package simpleProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr= {12,23,45,65,76,87};
		int l=0;
		int h=arr.length-1;
		System.out.println(Arrays.toString(arr));
		while(l<h) {
			int temp=arr[l];
			arr[l]=arr[h];
			arr[h]=temp;
			l++;
			h--;
		}
		System.out.println(Arrays.toString(arr));
	}

}
