package task3;

public class Problem3 {
    public static void main(String[] args) {
        int totalStudents = 20;
        int[] rollNumbers = new int[totalStudents];
        int startRollNumber = 101;

        for (int i = 0; i < totalStudents; i++) {
            rollNumbers[i] = startRollNumber + i;
        }
        int numberOfGroups = 4;
        for (int group = 0; group < numberOfGroups; group++) {
            System.out.println("Group " + (group + 1) + ":");
            for (int i = group; i < totalStudents; i += numberOfGroups) {
                System.out.println(rollNumbers[i]);
            }
            System.out.println();
        }
    }
}
