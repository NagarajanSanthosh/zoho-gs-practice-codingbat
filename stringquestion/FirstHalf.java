package stringquestion;

import java.util.Scanner;

public class FirstHalf {
    public static String firstHalf(String str) {
        return str.substring(0, str.length()/2);
      }
      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(firstHalf(scanner.nextLine()));
        scanner.close();
    }
}
