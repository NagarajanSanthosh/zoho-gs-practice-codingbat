package stringquestion;

import java.util.Scanner;

public class FirstTwo {
    public static String firstTwo(String str) {
        if(str.length() < 2) {
          return str;
        }
        return str.substring(0,2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(firstTwo(scanner.nextLine()));
        scanner.close();
    }
      
}
