package simpleProgram;

public class AverageNumberPresentInEvenLocation {

	public static void main(String[] args) {
		int[] arr= {12,23,45,65,76,87};
		int count=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				sum=sum+arr[i];
			count++;
			}
		}
		System.out.println("the average number of even postion is "+sum/count);
		
	}
}
