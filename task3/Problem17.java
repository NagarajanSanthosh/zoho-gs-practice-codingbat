package task3;

import java.util.Arrays;

public class Problem17 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int newArr[] = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        int index = 0;
        while (left <= right) {
            newArr[index++] = arr[right--];
            if (left <= right) {
                newArr[index++] = arr[left++];
            }
        }
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("After rearrange: " + Arrays.toString(newArr));
    }
}

/*
 * Alternate sorting: Given an array of integers, rearrange the array in such a
 * way that
 * the first element is first maximum and second element is first minimum.
 * Example:
 * Input : {1, 2, 3, 4, 5, 6, 7}
 * Output: {7, 1, 6, 2, 5, 3, 4}
 */