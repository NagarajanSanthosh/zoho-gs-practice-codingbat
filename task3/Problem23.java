package task3;

import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Height");
        int height = scan.nextInt();
        for (int i = height; i >= 1; i--) {
            for (int space = 0; space < height - i; space++)
                System.out.print(" ");
            for (int n = 0; n < i; n++)
                System.out.print(i + " ");
            System.out.println();
        }
        scan.close();
    }
}
