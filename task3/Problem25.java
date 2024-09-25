package task3;

import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String n = "12345";
        int len = n.length();
        int mid = len / 2;
        // upper pattern
        for (int i = 0; i <= mid; i++) {
            for (int sp = 0; sp < i; sp++)
                System.out.print(" ");
            System.out.print(n.charAt(i));
            if (i != mid) {
                for (int sp = 0; sp < len - 2 * (i + 1); sp++)
                    System.out.print(" ");
                System.out.print(n.charAt(len - i - 1));
            }
            System.out.println();
        }
        // lower pattern
        for (int i = mid - 1; i >= 0; i--) {
            for (int sp = 0; sp < i; sp++)
                System.out.print(" ");
            System.out.print(n.charAt(i));
            for (int sp = 0; sp < len - 2 * (i + 1); sp++)
                System.out.print(" ");
            System.out.println(n.charAt(len - i - 1));
        }
        scan.close();
    }
}

/*
 * Write a program to print the following output for the given input. You can
 * assume
 * the string is of odd length
 * E.g 1: Input: 12345
 * Output:
 * 1 5
 * 2 4
 * 3
 * 2 4
 * 1 5
 */
