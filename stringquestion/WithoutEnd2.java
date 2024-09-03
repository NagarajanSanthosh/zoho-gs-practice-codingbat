package stringquestion;

import java.util.Scanner;

public class WithoutEnd2 {
    public static String withouEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(withouEnd2(scanner.nextLine()));
        scanner.close();
    }
}
