package stringquestion;

import java.util.Scanner;

public class Right2 {
    public static String right2(String str) {
        return str.substring(str.length()-2)+""+str.substring(0, str.length()-2);
      }
      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(right2(scanner.nextLine()));
        scanner.close();
    }
}
