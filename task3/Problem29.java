package task3;

import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                for (int s = 0; s < n; s++)
                    System.out.print("*");
                System.out.println();
            } else {
                System.out.println("*");
            }
        }
        scan.close();
    }
}

/*
 * Write a program to print the alphabet 'C' with the stars based on the given
 * numbers
 * E.g 1: Input: 4
 * Output:
 ****
 * 
 * 
 **** 
 */
