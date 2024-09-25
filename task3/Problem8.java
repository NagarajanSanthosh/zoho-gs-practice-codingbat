package task3;

import java.util.Scanner;

public class Problem8 {
    public static int asciiValue(char a) {
        return (int) a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        System.out.println(asciiValue(a));
        scanner.close();
    }
}
