package stringquestion;

import java.util.Scanner;

public class Middle2 {
    public static String middleTwo(String str) {
        int n = str.length() / 2;
        return str.substring(n - 1, n + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(middleTwo(scanner.nextLine()));
        scanner.close();
    }

}
