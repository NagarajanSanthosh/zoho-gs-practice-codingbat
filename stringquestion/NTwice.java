package stringquestion;

import java.util.Scanner;

public class NTwice {
    public static String nTwice(String str, int n) {
        return str.substring(0, n) + "" + str.substring(str.length() - n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(nTwice(scanner.nextLine(), scanner.nextInt()));
        scanner.close();
    }
}
