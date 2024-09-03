package stringquestion;

import java.util.Scanner;

public class MakeOutWord {
    public static String makeOutWord(String out, String word) {
        return out.substring(0,2)+word+out.substring(2,out.length());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(makeOutWord(scanner.nextLine(), scanner.nextLine()));
        scanner.close();
    }
      
}
