package task3;

import java.util.Arrays;

public class Problem18 {
    public static void main(String[] args) {
        int[] arr1 = { 13, 2, 4, 15, 12, 10, 5 };
        System.out.println("Original array : ");
        System.out.println(Arrays.toString(arr1));
        sortOddEvenInPlace(arr1);
        System.out.println("After sorting odd and even positions in-place:");
        System.out.println(Arrays.toString(arr1));
    }

    public static void sortOddEvenInPlace(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 2; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 1; i < n - 1; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
