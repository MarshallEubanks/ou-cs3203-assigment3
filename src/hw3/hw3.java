package hw3;
import java.util.Scanner;

public class hw3 {
	
	public static int sumArray(int[] arr) {
		int sum =0;
		for (int i=0; i< arr.length;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	public static int multiplyArray(int[] arr) {
		int product = arr[0];
		
		for (int i =1; i < arr.length; i++) {
			product = product * arr[i];
		}
		return product;
	}
	

}
