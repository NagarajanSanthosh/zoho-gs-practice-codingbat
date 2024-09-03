package stringquestion;

import java.util.Scanner;

public class Left2 {
    public static String left2(String str) {
        return str.substring(2) + "" + str.substring(0, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(left2(scanner.nextLine()));
        scanner.close();
    }
}
