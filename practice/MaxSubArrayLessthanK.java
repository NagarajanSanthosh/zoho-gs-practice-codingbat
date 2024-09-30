package practice;

import java.util.Arrays;

/**
 * MaxSubArrayLessthanK
 */
public class MaxSubArrayLessthanK {
    public static int[] returnArrayMax(int[] a, int k) {
        int l = 0, r = 0, finalSum = 0, sum = 0, start = 0, end = -1;
        while (r < a.length) {
            sum += a[r];
            while (sum > k) {
                sum -= a[l];
                l++;
            }
            if (sum <= k) {
                if (sum > finalSum) {
                    finalSum = sum;
                    end = r;
                    start = l;
                }
            }
            r++;
        }
        if (end == -1)
            return new int[] { 0 };
        int[] result = new int[end - start + 1];
        result = Arrays.copyOfRange(a, start, end + 1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnArrayMax(new int[] { 2, 5, 1, 7, 10 }, 14)));
    }
}