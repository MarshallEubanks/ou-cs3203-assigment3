package hw3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

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
	
	public static ArrayList<Integer> createArrayList(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i=0; i < arr.length;i++) {
			list.add(arr[i]);
		}
		return list;
	}
	
	public static int[] createArray(int...nums) {
		int[] arr = nums;
		return arr;
	}
	
	public static int[] reverseOrder(int[] arr) {
		int[] reverse = arr;
		
		for (int i=0; i < reverse.length / 2;i++) {
			int j = reverse[i];
			reverse[i] = reverse[reverse.length-i-1];
			reverse[reverse.length - i-1] = j;
		}
		return reverse;
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
		
		System.out.println("Array:" + Arrays.toString(arr));
		
		System.out.println("Options:");
		System.out.println("S - Sum of Array");
		System.out.println("P - Product of Array");
		System.out.println("R - Reverse of Array");
		System.out.println("X - Exit");
		
		String option = scan.next();
		
		while (!option.equalsIgnoreCase("X")) {
			
			if (option.equalsIgnoreCase("S")) {
				int sum = sumArray(arr);
				System.out.println("Sum: " + sum);
			}
			
			else if (option.equalsIgnoreCase("P")) {
				int product = multiplyArray(arr);
				System.out.println("Product: " + product);
			}
			
			else if (option.equalsIgnoreCase("R")) {
				int[] reverse = reverseOrder(arr);
				System.out.println("Reverse: " + Arrays.toString(reverse));
			}
			
			System.out.println("Enter next option");
			option = scan.next();
		}
		
		System.out.println("Options completed");
		
	}
}
