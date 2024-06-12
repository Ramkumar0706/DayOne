package simpleProgram;

public class EvenAndOddInTheArray {
	public static void main(String[] args) {
		int[] arr= {12,23,45,65,76,87};
		System.out.println("the even number present in the array is");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				System.out.println(arr[i]);
		}
		System.out.println("the odd number present in the array is");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0)
				System.out.println(arr[i]);
		}
	}
}
