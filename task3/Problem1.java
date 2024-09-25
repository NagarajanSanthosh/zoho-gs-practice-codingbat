package task3;

import java.util.Scanner;

public class Problem1 {
    public static String letters(char a) {
        String s = "";
        int val = (int) a;
        for(int i = val; i <= (int) 'z'; i++) {
            s += (char) i+"";
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        System.out.println(letters(a));
        scanner.close();
    }
}
