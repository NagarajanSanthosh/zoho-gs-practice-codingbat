package task3;

public class Problem19 {
    public static void main(String[] args) {

        int[][] array = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        System.out.println("Original Array");
        printArray(array);
        int[][] rotatedArray90Degree = rotate90Degree(array);
        System.out.println("2D Array after left rotate 90 degree");
        printArray(rotatedArray90Degree);
        int[][] rotateArrayAs1D = rotateAs1D(array);
        System.out.println("2D Array after left rotate as a 1D array");
        printArray(rotateArrayAs1D);
    }

    // Rotate 90 Degree
    public static int[][] rotate90Degree(int[][] array) {
        int row = array.length;
        int col = array.length;

        int[][] rotatedArray = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rotatedArray[col - j - 1][i] = array[i][j];
            }
        }
        return rotatedArray;
    }

    // Rotate 2D Array as a 1D
    public static int[][] rotateAs1D(int[][] array) {
        int row = array.length;
        int col = array[0].length;
        int[] arr = new int[row * col];
        for (int i = 0; i < row * col; i++) {
            arr[i] = array[i / row][i % col];
        }
        rotateArray(arr);
        int[][] newArr = new int[row][col];
        for (int i = 0; i < row * col; i++) {
            newArr[i / row][i % col] = arr[i];
        }
        return newArr;
    }

    // Rotate 1D array
    public static void rotateArray(int[] array) {
        int temp = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = temp;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
