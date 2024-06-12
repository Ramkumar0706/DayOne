package simpleProgram;

public class CountEvenNumber {
	public static void main(String[] args) {
		int[] arr= {12,23,45,65,76,87};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				count++;
		}
		System.out.println("the count of even number present \n in the array is "+ count);
	}

}
