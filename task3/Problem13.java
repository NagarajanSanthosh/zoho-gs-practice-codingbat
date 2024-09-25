package task3;

import java.util.Arrays;
import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[] { 4, 2, 6, 1, 8 };
        // System.out.println("Enter the length of the array : ");
        // int n = scan.nextInt();
        // System.out.println("Enter the elements of the array : ");
        // int[] arr = new int[n];
        // for(int i = 0; i < n; i++) {
        // arr[i] = scan.nextInt();
        // }
        int min = Integer.MAX_VALUE;
        for (int el : arr) {
            min = Math.min(el, min);
        }
        System.out.println(Arrays.toString(arr) + "\n" + "Minimum element ==> " + min);
    }
}
