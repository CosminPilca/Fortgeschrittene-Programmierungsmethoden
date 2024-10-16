import java.util.Arrays;

public class Aufgabe2 {

    public static int findMaximum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int findMinimum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int findSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int findMaximumSumOfNMinusOne(int[] numbers) {
        return findSum(numbers) - findMinimum(numbers);
    }

    public static int findMinimumSumOfNMinusOne(int[] numbers) {
        return findSum(numbers) - findMaximum(numbers);
    }

    public static void main(String[] args) {
        int[] numbers = {4, 8, 3, 10, 17};

        System.out.println("Max: " + findMaximum(numbers));
        System.out.println("Min: " + findMinimum(numbers));
        System.out.println("Max sum of n-1: " + findMaximumSumOfNMinusOne(numbers));
        System.out.println("Min sum of n-1: " + findMinimumSumOfNMinusOne(numbers));
    }
}
