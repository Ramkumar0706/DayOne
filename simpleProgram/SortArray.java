package simpleProgram;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] arr= {72,83,95,115,76,87};
		System.out.println("before sorting"+Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After sorting"+Arrays.toString(arr));
	}
}
