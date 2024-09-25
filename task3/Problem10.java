package task3;

import java.util.Scanner;

public class Problem10 {
    static String reverseProgram(String s) {
        if(s.isEmpty()) {
            return s;
        }
        int stringIndex = s.indexOf(" ");
        if(stringIndex == -1) return s;
        
        return reverseProgram(s.substring(stringIndex+1))+" "+s.substring(0, stringIndex);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(reverseProgram(s));
        scanner.close();
    }
}
