package hw3;

public class hw3 {
	
	public static int sumArray(int[] arr) {
		int sum =0;
		for (int i=0; i< arr.length;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2 ,3};
		int sum = sumArray(arr);
		System.out.print(sum);
	}
}
