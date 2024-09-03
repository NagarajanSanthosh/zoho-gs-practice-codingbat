package stringquestion;

import java.util.Scanner;

public class MiddleThree {
    public static String middleThree(String str) {
        if (str.length() <= 3)
            return str;
        int n = str.length() / 2;
        return (str.substring(n - 1, n + 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(middleThree(scanner.nextLine()));
        scanner.close();
    }
}
