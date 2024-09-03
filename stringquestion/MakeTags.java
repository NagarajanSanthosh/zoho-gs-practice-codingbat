package stringquestion;

import java.util.Scanner;

public class MakeTags {
    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(makeTags(scanner.nextLine(), scanner.nextLine()));
        scanner.close();
    }

}
