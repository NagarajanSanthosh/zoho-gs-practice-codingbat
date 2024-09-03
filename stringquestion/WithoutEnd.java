package stringquestion;

import java.util.Scanner;

public class WithoutEnd {
    public static String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(withoutEnd(scanner.nextLine()));
        scanner.close();
    }
      
}
