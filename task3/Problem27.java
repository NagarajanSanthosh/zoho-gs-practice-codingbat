package task3;

import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String s1 = scan.next();
        System.out.println("Enter String 2 : ");
        String s2 = scan.next();
        int result = findStartingIndex(s1, s2);
        if (result != -1)
            System.out.println("Starting index of String s1 in String 1 ==> " + result);
        else
            System.out.println("String Not found! ==> " + result);
        scan.close();
    }

    public static int findStartingIndex(String s1, String s2) {
        int range = s1.length() - s2.length();
        if (range < 0)
            return -1;
        int i = 0, j = 0;
        while (i < range) {
            if (s1.charAt(i) == s2.charAt(0)) {
                while (j < s2.length()) {
                    if (s1.charAt(i + j) != s2.charAt(j)) {
                        break;
                    }
                    j++;
                }
                if (j == s2.length())
                    return i;
                else
                    j = 0;
            }
            i++;
        }
        return -1;
    }
}

/*
 * Find if a String2 is substring of String1. If it is, return the index of the
 * first
 * occurrence. else return -1.
 * E.g 1: Input: String 1: test123string
 * String 2: 123
 * Output: 4
 * E.g 2: Input: String 1: testing12
 * String 2: 1234
 * Output: -1
 * 
 */
