package task3;

import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++)
                System.out.print("  ");
            for (int incr = 1; incr <= i; incr++)
                System.out.print(incr + " ");
            for (int decr = i - 1; decr >= 1; decr--)
                System.out.print(decr + " ");
            System.out.println();
        }
        scan.close();
    }
}
