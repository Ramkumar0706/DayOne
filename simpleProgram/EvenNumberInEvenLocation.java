package simpleProgram;

public class EvenNumberInEvenLocation {
	public static void main(String[] args) {
		int[] arr= {12,23,45,65,76,87};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0&&i%2==0)
				System.out.println(arr[i]);
		}
	}
}
