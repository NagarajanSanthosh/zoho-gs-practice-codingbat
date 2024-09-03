package stringquestion;

import java.util.Scanner;

public class NonStart {
    public static String nonStart(String a, String b) {
        return a.substring(1) + "" + b.substring(1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(nonStart(scanner.nextLine(), scanner.nextLine()));
        scanner.close();
    }
}
