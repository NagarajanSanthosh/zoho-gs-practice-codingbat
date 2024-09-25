package warmup2;

public class StringYak {
    public static String stringYak(String str) {
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {
                s += str.charAt(i);
            }
        }
        return s;
    }

}
