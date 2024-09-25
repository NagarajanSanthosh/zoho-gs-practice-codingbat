package warmup2;

public class AltPairs {
    public static String altPairs(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i = i + 4) {
            s += str.charAt(i);
            if (i + 1 < str.length()) {
                s += str.charAt(i + 1);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));         
        System.out.println(altPairs("Chocolate"));      
        System.out.println(altPairs("CodingHorror"));   
    }
    
}
