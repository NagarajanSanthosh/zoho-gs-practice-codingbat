package stringquestion;

import java.util.Scanner;

public class ExtraEnd {
    public static String extraEnd(String str) {
        int n = str.length();
        return str.substring(n-2)+""+str.substring(n-2)+""+str.substring(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(extraEnd(scanner.nextLine()));
        scanner.close();
    }
      
}
