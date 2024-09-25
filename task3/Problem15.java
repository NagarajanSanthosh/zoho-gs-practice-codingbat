package task3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem15 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 2, 6, 6, 3, 4, 2, 3, 4, 5, 3, 4, 3 };
        findDuplicate(arr);
    }

    public static void findDuplicate(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else
                mp.put(arr[i], 1);
        }
        System.out.println("Array ==> " + Arrays.toString(arr));
        System.out.println("Duplicate Elements : ");
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > 1)
                System.out.print(entry.getKey() + " ");
        }
    }
}
