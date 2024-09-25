package task3;

import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scan.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int space = 1; space < i; space++)
                System.out.print("  ");
            for (int incr = i; incr <= n; incr++)
                System.out.print(incr + " ");
            for (int decr = n - 1; decr >= i; decr--)
                System.out.print(decr + " ");
            System.out.println();
        }
        scan.close();
    }
}
