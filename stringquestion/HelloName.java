package stringquestion;

import java.util.Scanner;

public class HelloName {
    public static String helloName(String name) {
        return "Hello "+name+"!"; 
      }
      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(helloName(scanner.nextLine()));
        scanner.close();
    }

}
