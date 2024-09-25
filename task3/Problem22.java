package task3;

import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Height : ");
        int height = scan.nextInt();
        for (int i = 0; i < height; i++) {
            for (int space = 0; space < i; space++)
                System.out.print(" ");
            for (int star = 0; star < height - i; star++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
