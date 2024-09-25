package task3;

public class Problem2 {
    public static void main(String[] args) {
        int number1 = 12; // Binary: 00001100
        int number2 = 25; // Binary: 00011001

        // Bitwise AND
        int andResult = number1 & number2; // Binary: 00001000
        System.out.println("number1 & number2 = " + andResult); // Output: 8

        // Bitwise OR
        int orResult = number1 | number2; // Binary: 00011101
        System.out.println("number1 | number2 = " + orResult); // Output: 29

        // Bitwise XOR
        int xorResult = number1 ^ number2; // Binary: 00010101
        System.out.println("number1 ^ number2 = " + xorResult); // Output: 21

        // Bitwise NOT (1's Complement)
        int notResult = ~number1; // Binary: 11110011 (in 8-bit representation)
        System.out.println("~number1 = " + notResult); // Output: -13

        // Left Shift
        int leftShiftResult = number1 << 2; // Binary: 00110000
        System.out.println("number1 << 2 = " + leftShiftResult); // Output: 48

        // Right Shift
        int rightShiftResult = number1 >> 2; // Binary: 00000011
        System.out.println("number1 >> 2 = " + rightShiftResult); // Output: 3

        // Unsigned Right Shift
        int unsignedRightShiftResult = number1 >>> 2; // Binary: 00000011
        System.out.println("number1 >>> 2 = " + unsignedRightShiftResult); // Output: 3
    }
}
