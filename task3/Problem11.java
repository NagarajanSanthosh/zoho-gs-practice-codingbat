package task3;

public class Problem11 {
    public static String expandString(String input) {
        StringBuilder result = new StringBuilder();
        int length = input.length();

        for (int i = 0; i < length; i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)) {
                int j = i + 1;
                StringBuilder number = new StringBuilder();

                while (j < length && Character.isDigit(input.charAt(j))) {
                    number.append(input.charAt(j));
                    j++;
                }

                int repeatCount = Integer.parseInt(number.toString());
                for (int k = 0; k < repeatCount; k++) {
                    result.append(currentChar);
                }

                i = j - 1;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(expandString("a1b10")); 
        System.out.println(expandString("b3c6d15")); 
    }
}
