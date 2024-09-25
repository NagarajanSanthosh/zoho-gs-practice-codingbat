package task3;


import java.util.Arrays;
import java.util.Scanner;

public class Question14 {
	public static void main(String[] args) {
//		int[] arr = new int[] {1,2,3,4,5};
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elemnts : ");
		for(int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Original Array ==> "+ Arrays.toString(arr));
		int[] copyArr = cloneArr(arr);
		System.out.println("Copy Array ==> "+ Arrays.toString(copyArr));
		scan.close();
	}
	public static int[] cloneArr(int[] arr) {
		int[] newArr = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		return newArr;
	}
}

// Java Program to copy all elements of one array into another array 