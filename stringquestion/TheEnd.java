package stringquestion;

import java.util.Scanner;

public class TheEnd {
    public static String theEnd(String str, boolean front) {
        if(front) {
          return str.substring(0, 1);
        }
        return str.substring(str.length()-1);
      }
      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(theEnd(scanner.nextLine(), scanner.nextBoolean()));
        scanner.close();
    }
}
