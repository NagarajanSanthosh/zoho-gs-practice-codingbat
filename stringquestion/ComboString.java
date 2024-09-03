package stringquestion;

import java.util.Scanner;

public class ComboString {
    public static String comboString(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        if (aLength < bLength) {
            return a + "" + b + "" + a;
        }
        return b + "" + a + "" + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(comboString(scanner.nextLine(), scanner.nextLine()));
        scanner.close();
    }
}
