package task3;


import java.util.Scanner;

public class Problem28 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of terms");
		int n = scan.nextInt();
		int result = 0;
		for(int i = 1; i <= n; i++) {
			result = (result * 10)+i;
		}
		System.out.println("The Sum is : "+result);
		scan.close();
	}
}

/*
Write a program to find the sum of the series. The series will be like 1 +11 + 111 + 1111 +.. n terms.  
E.g 1: Input: Input the number of terms : 5 
		Output :  
				1 + 11 + 111 + 1111 + 11111 
				The Sum is : 12345  
E.g 2: Input: Input the number of terms : 3
  		Output :
 				1 + 11 + 111
 				The Sum is : 123
*/

