import java.util.Arrays;
//Aufgabe 1

public class Aufgabe1 {

    public static int[] getFailingGrades(int[] grades) {
        return Arrays.stream(grades).filter(grade -> grade < 40).toArray();
    }

    public static double calculateAverage(int[] grades) {
        return Arrays.stream(grades).average().orElse(0.0);
    }

    public static int[] roundGrades(int[] grades) {
        return Arrays.stream(grades)
                .map(grade -> {
                    if (grade >= 38 && grade % 5 >= 3) {
                        return grade + (5 - grade % 5);
                    }
                    return grade;
                })
                .toArray();
    }

    public static int getHighestRoundedGrade(int[] grades) {
        return Arrays.stream(grades).max().orElse(0);
    }

    public static void main(String[] args) {
        int[] grades = {84, 29, 31, 89, 92, 75, 37};

        System.out.println("Failing grades: " + Arrays.toString(getFailingGrades(grades)));
        System.out.println("Average grade: " + calculateAverage(grades));
        System.out.println("Rounded grades: " + Arrays.toString(roundGrades(grades)));
        System.out.println("Highest rounded grade: " + getHighestRoundedGrade(grades));
    }
}