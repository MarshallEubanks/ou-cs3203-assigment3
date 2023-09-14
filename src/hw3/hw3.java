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
		int produss = arr[0];
		
		for (int i =1; i < arr.length; i++) {
			produss = produss * arr[i];
		}
		return produss;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Input array elements");
		
		int element;
		for (int i=0; i < arr.length;i++) {
			element = scan.nextInt();
			arr[i] = element;
			
		}
		
		System.out.println("Options:");
		System.out.println("S - Sum of Array");
		System.out.println("P - Product of Array");
		System.out.println("X - Exit");
		
		String option = scan.next();
		
		while (!option.equals("X")) {
			
			if (option.equals("S")) {
				int sum = sumArray(arr);
				System.out.println(sum);
			}
			
			else if (option.equals("P")) {
				int product = multiplyArray(arr);
				System.out.println(product);
			}
			
			System.out.println("Enter next option");
			option = scan.next();
		}
		
		System.out.println("Options completed");
		
	}
}
