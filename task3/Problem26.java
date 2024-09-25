package task3;

import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + n; j++) {
                if (j >= n + i || j < n - i)
                    System.out.print("*");
                else
                    System.out.print("_");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n + n; j++) {
                if (j >= n + i || j < n - i)
                    System.out.print("*");
                else
                    System.out.print("_");
            }
            System.out.println();
        }
        scan.close();
    }
}

/*
 * Write a program to print the following pattern for the given input number.
 * E.g 1: Input: 4
 * Output:
 ******** 
 *** __***
 ** ____**
 * ______*
 ** ____**
 *** __***
 ********
 * 
 */
