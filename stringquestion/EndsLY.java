package stringquestion;

import java.util.Scanner;

public class EndsLY {
    public static boolean endsLy(String str) {
        if (str.length() < 2)
            return false;
        return str.substring(str.length() - 2).equals("ly");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(endsLy(scanner.nextLine()));
        scanner.close();
    }

}
