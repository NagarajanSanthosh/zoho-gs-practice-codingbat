package stringquestion;

import java.util.Scanner;

public class MakeAbba {
    public static String makeAbba(String a, String b) {
        return a+b+b+a;
      }
      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(makeAbba(scanner.nextLine(),scanner.nextLine()));
        scanner.close();
    }
}
