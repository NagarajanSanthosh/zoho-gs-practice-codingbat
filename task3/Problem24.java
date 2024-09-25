package task3;

import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();
        int height = findHeight(num);
        int n = 1;
        for (int i = 1; i <= height; i++) {
            for (int space = 0; space < height - i; space++)
                System.out.print(" ");
            for (int j = 0; j < i && n <= num; j++)
                System.out.print(n++ + " ");
            System.out.println();
        }
        scan.close();
    }

    public static int findHeight(int n) {
        int h = 1;
        while ((h * (h + 1)) / 2 <= n) {
            h++;
        }
        return h;
    }
}
/*
 * Write a program to make such a pattern like a pyramid with numbers increased
 * by 1. Eg: Input : 10
 * Output:
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */