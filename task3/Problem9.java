package task3;

import java.util.Scanner;

public class Problem9 {
    static int numberReverse(int n) {
        int rev = 0;
        while (n != 0) {
            int a = n % 10;
            rev = rev * 10 + a;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(numberReverse(a));
        scanner.close();
    }
}
