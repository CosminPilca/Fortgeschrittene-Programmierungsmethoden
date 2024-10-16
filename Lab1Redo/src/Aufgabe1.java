import java.util.Arrays;

public class Aufgabe1 {

    public static int[] getFailingGrades(int[] grades) {
        int count = 0;
        for (int grade : grades) {
            if (grade < 40) {
                count++;
            }
        }

        int[] failingGrades = new int[count];
        int index = 0;
        for (int grade : grades) {
            if (grade < 40) {
                failingGrades[index++] = grade;
            }
        }
        return failingGrades;
    }

    public static double calculateAverage(int[] grades) {
        if (grades.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public static int[] roundGrades(int[] grades) {
        int[] roundedGrades = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if (grade >= 38 && grade % 5 >= 3) {
                roundedGrades[i] = grade + (5 - grade % 5);
            } else {
                roundedGrades[i] = grade;
            }
        }

        return roundedGrades;
    }

    public static int getHighestRoundedGrade(int[] grades) {
        if (grades.length == 0) {
            return 0;
        }

        int max = grades[0];
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] grades = {84, 29, 31, 89, 92, 75, 37};

        System.out.println("Failing grades: " + Arrays.toString(getFailingGrades(grades)));
        System.out.println("Average grade: " + calculateAverage(grades));
        System.out.println("Rounded grades: " + Arrays.toString(roundGrades(grades)));
        System.out.println("Highest rounded grade: " + getHighestRoundedGrade(roundGrades(grades)));
    }
}
